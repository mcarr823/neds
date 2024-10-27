# Networking

Networking in the Neds app relies on HTTP requests being built and performed by the :net module.

Implementations of the :net class should be encapsulated by DataSource classes in the :data module.

A typical implementation of an API endpoint will look something like this:
- :common module defines the API endpoint, path, etc. in `dev.mcarr.neds.common.enums.http`
- :common module defines the expected response data in `data class` objects in the `dev.mcarr.neds.data.classes` package
- :data module defines a data source for querying that data in `dev.mcarr.neds.data.datasources`

That DataSource class might then be built upon further to make the data more useful for the app.

See the [Data Sources](../datasource/README.md) doc for more information.

## Defining URLs

### Adding new query parameters

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

### Changing the URL structure

The `dev.mcarr.neds.common.enums.http` package already contains enums for the known components of a Neds URI.

If you want to change part of the URL, you can add to these enums to make new URL structures possible.

For example, let's say you wanted to create a URL of `https://api.neds.com.au/rest/v2/racing/`

This is not currently possible, because only the v1 path has been defined.

To query the v2 path, you would first update the ApiVersion enum:

```kotlin
enum class ApiVersion(val value: String){
    V1("v1"),
    V2("v2")
}
```

Then call that new URL where needed:

```kotlin
NedsUri.Builder()
    .setApiVersion(ApiVersion.V2)
    // ...Followed by the rest of the build
```