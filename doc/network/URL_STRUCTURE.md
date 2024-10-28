# Changing the URL structure

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