## Mocking Android APIs

Many of the unit tests for this app utilize Robolectric for the purpose of mocking Android APIs.

This includes the Uri class (:net module) and unit tests for composable components (:ui module).

In order to setup a test which requires mocked Android APIs, use the @RunWith tag to tell it to use the Robolectric test runner.

## Example

```kotlin
@RunWith(RobolectricTestRunner::class)
class MyClassTest(){

    @Test
    fun test(){
        // I can now use mocked Android APIs in here
    }
    
}
```