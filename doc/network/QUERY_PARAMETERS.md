# Query parameters

* `:common` module
* `dev.mcarr.neds.common.enums` package
* `:net` module
* `dev.mcarr.neds.net.uri` package

## Defining parameter types

Query parameters should be defined in the `dev.mcarr.neds.common.enums` package in an enum class. Unless it is sufficiently generic, in which case a new class shouldn't be needed.

For example, a query parameter of `count` (Int) doesn't require an enum class, since it's an arbitrary number.

On the other hand, a query parameter of `category` (UUID) would require an enum class, since the UUID is a pre-defined value known and defined by the server.

## Defining HTTP arguments

Regardless of whether a new parameter type needs to be created or not, the new parameter should be added to the NedsUri and NedsUri.Builder() classes in the :net module.

The Builder will require:
- a variable for the new argument
- a function to set the new argument
- logic added to the build() function to pass that new argument to the NedsUri class

The NedsUri class will require:
- a variable for the new argument, set in the constructor
- logic added to the toString() function to add the new variable to the constructed URL

## Example

Let's say we want to add a new query parameter: dayOfWeek

There are only 7 possibly values, and we never want to deviate from those.

So we would first add a new enum class to the :common module.

```kotlin
enum class DayOfWeek(val name: String){
    MONDAY("monday"),
    // ...
    SUNDAY("sunday")
}
```

Then, we would add new functions and variables to the URI classes in the :net module.

```kotlin
class NedsUri{

    private val dayOfWeek: DayOfWeek?
    
    constructor(
        // ...Other constructor args
        dayOfWeek: DayOfWeek?
    ){
        // ...Other variables being set
        this.dayOfWeek = dayOfWeek
    }
    
    override fun toString(): String {
        // ...Builder initialization
        if (dayOfWeek != null)
            builder.appendQueryParameter("day", dayOfWeek.name)
        // ...The rest of the toString() function
    }
    
    class Builder(){
        private var dayOfWeek: DayOfWeek? = null
        
        fun setDayOfWeek(dayOfWeek: DayOfWeek) = this.apply{
            this.dayOfWeek = dayOfWeek
            return this
        }
        
        fun build(): NedsUri {
        
            // ...Validate data
            
            return new NedsUri(
                // ...Other arguments
                dayOfWeek = dayOfWeek
            )
            
        }
    }
}
```

Like so, we now have a new optional query argument of day=x in the URL.

The data type is an enum, so it's quite strict about what can actually be sent via that argument.

It is also null by default, and only gets used if isn't null. So the new argument isn't used unless we do so intentionally.

## Default parameters

Note that when you add a new parameter, you must take care that it does not unintentionally modify the default behavior of the NedsUri or Builder classes.

If you define a new parameter which is enabled by default, then that new parameter would be added to all existing functions which use the Builder. Which is (probably) not what you want to do.

This is something which will be picked up by the unit tests in the :net module, but it is still something you should be aware of.

To avoid this, you should make new arguments null by default, and only append them to the URL if they're set to a non-null value.