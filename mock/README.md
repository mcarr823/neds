# :mock module

The :mock module is used to provide mock data for other classes to utilize.

This includes unit tests which require data to run, or composable previews which need data to display.

Test data should be contained in the :mock module instead, so it can be reused by multiple other modules and excluded from production builds more easily.

## Module dependencies

- :common

## Faking or mocking

In spite of the package name, this module doesn't necessarily mock data.

Per the [Android developer documentation](https://developer.android.com/training/testing/fundamentals/test-doubles), faking data is preferred over mocking it.

Data should be faked wherever it makes sense to do so.
