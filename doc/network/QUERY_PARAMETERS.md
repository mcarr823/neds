# Defining new query parameters

Query parameters should be defined in the `dev.mcarr.neds.common.enums` package in an enum class. Unless it is sufficiently generic, in which case a new class shouldn't be needed.

For example, a query parameter of `count` (Int) doesn't require an enum class, since it's an arbitrary number.

On the other hand, a query parameter of `category` (UUID) would require an enum class, since the UUID is a pre-defined value known and defined by the server.

In both cases, the new parameter should be added to the NedsUri and NedsUri.Builder() classes in the :net module.

For example:

```kotlin
class NedsUri{
    private val myNewArg: MyNewClass?
    
    constructor(myNewArg: MyNewClass?){
        this.myNewArg = myNewArg
    }
    
    toString(){
        // ...Builder initialization
        if (myNewArg != null)
            builder.addQueryParameter("arg", myNewArg)
        // ...The rest of the toString() function
    }
    
    class Builder(){
        private var myNewArg: MyNewClass? = null
        
        fun setMyNewArg(myNewArg: MyNewClass) = this.apply{
            this.myNewArg = myNewArg
            return this
        }
        
        fun build(){
            return new NedsUri(myNewArg)
        }
    }
}
```