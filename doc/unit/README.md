# Unit tests

This app contains unit tests for numerous areas, albeit not complete coverage.

It does not use instrumented tests, and instead opts for synthetic testing using Junit or Robolectric to cover as many use cases as feasible.

These unit tests are then run automatically via a CI task, and should be run regularly while modifying the app.

1. [Mocking Android APIs](MOCK.md)
2. [Naming schemes](NAMING.md)
