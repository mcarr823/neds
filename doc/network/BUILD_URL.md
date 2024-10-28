# Building URLs

URLs are built by using the NedsUri.Builder class in the :net module by following the builder design pattern.

Values are taken from enums in the :common module and fed to the builder, then compiled into a NedsUri object.

For example:

```kotlin
val nedsUri = NedsUri.Builder()
                .setEventType(EventType.RACING)
                .setMethod(RacingMethod.NEXT_RACES)
                .setCount(10)
                .build()
```

The NedsUri object can then be used with HTTP GET, POST, etc. functions from the KtorClient HTTP client class.