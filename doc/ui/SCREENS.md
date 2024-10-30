# Screens

- `:ui` module
- `dev.mcarr.neds.ui.screens` package

Screens are composable elements which contain one or more other composables, and take a viewmodel as an argument.

Each screen should represent a different page of the app, and should provide specific functionality to the user.

* At this point in time there is only one screen in this app.

## Passing data to composables

The screen should not pass the viewmodel to its components.

Instead, it should derive data from the viewmodel, then use that data to create or lay out its components.

## More information

For more information on viewmodels/composables, and examples of how these classes are used together, check the [MVVM And Data](../datasource/README.md) section of the documentation.