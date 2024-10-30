# URL structure

* `:common` module
* `dev.mcarr.neds.common.enums` package
* `:net` module
* `dev.mcarr.neds.net.uri` package

The structure of a URL is changed in a similar manner to query parameters, except that enums already exist for the known components of a Neds URI.

So it is likely that you will change the enums to modify the URL, but not need to add any new ones.

## Example

Let's say you wanted to create a URL of `https://api.neds.com.au/rest/v2/racing/`

This is not currently possible, because only the v1 path has been defined.

To query the v2 path, you would first update the ApiVersion enum:

```kotlin
enum class ApiVersion(val value: String){
    V1("v1"),
    V2("v2")
}
```

Then use that new URL in the Builder where needed:

```kotlin
NedsUri.Builder()
    .setApiVersion(ApiVersion.V2)
    // ...Followed by the rest of the build
```