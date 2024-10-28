# Response data

Response data from the KtorClient HTTP client class is represented as a HttpResponse object.

However, since the KtorClient has been setup to support serialization, it is possible to automatically convert that response into something more useful.

This can be achieved by defining a data class with the @Serializable tag.

For example:

```kotlin
@Serializable
data class MyResponseObject(val message: String)

// Example response: {message:"Success"}
val response = KtorClient.get(uri).body() as MyResponseObject
```

In the above example, a class called MyResponseObject has been created which expects a String parameter called message.

The HTTP response body as been cast to that class.

If the HTTP response matches the expected format (a JSON object with a single String attribute of "message") then the casting should succeed, and we will have an instance of MyResponseObject.

## Complex data

More complex responses can also be converted automatically.

For examples of this, check out the data classes in the :common module in the `dev.mcarr.neds.common.classes.racing` package.