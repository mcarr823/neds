# Response data

* `:common` module
* `dev.mcarr.neds.common.enums` package

Response data from the KtorClient HTTP client class is represented as a HttpResponse object.

However, since the KtorClient has been setup to support serialization, it is possible to automatically convert that response into something more useful.

This can be achieved by defining a data class in the :common package with the @Serializable tag.

For example:

```kotlin
@Serializable
data class MyResponseObject(val message: String)
```

Responses from the HTTP client can then be converted to that class automatically, as long as they're in the right format.

```kotlin
// Example response: {message:"Success"}
val response = KtorClient.get(uri).body() as MyResponseObject
```

In the above example, a class called MyResponseObject has been created which expects a String parameter called message.

The HTTP response body as been cast to that class.

If the HTTP response matches the expected format (a JSON object with a single String attribute of "message") then the casting should succeed, and we will have an instance of MyResponseObject.

## Complex data

More complex responses can also be converted automatically.

For example, nested JSON objects, or "arrays" with strings as keys (like a dictionary).

Check out the existing data classes in the :common module in the `dev.mcarr.neds.common.classes.racing` package for examples of this.