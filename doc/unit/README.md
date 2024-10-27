# Unit tests

## Mocking Android APIs

Many of the unit tests for this app utilize Robolectric for the purpose of mocking Android APIs.

This includes the Uri class (:net module) and unit tests for composable components (:ui module).

## Unit test naming scheme

### File and class names

Unit test files and classes should be named after the file or class they are testing, with "Test" appended to the end.

For example, the NedsUri class should be tested in a class called NedsUriTest.

### Function naming

Function names in Neds follow the when_then naming scheme.

For example:

- eventTypeIsSet_constructionSucceeds (when event type is set, then construction succeeds)

### Package structure

Unit tests should mimic the package structure of the classes being tested.

For example:

| Directory |        Package         | File            |
|:----------|:----------------------:|:----------------|
| main      | dev.mcarr.neds.net.uri | NedsUri.kt      |
| test      | dev.mcarr.neds.net.uri | NedsUriTest.kt  |

