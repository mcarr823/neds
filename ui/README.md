# :ui module

The :ui module contains components, screens and viewmodels used by the Neds app.

A given screen will have a single viewmodel, and one or more components.

## Module dependencies

- :common
- :mock

## Components

Components should be placed in the `dev.mcarr.neds.ui.components` package.

### Generic components

Components which aren't specific to a single screen or feature within the Neds app should be placed in the `base` package.

For example, if you create a MenuComponent which could be used on several different screens, it belongs in the `base` package.

A generic component should be used as the basis for an event-specific component wherever there is sufficient overlap.

### Event-specific components

Components which pertain to a specific type of event (eg. racing) should be placed in their own package.

These components should build upon generic components wherever it makes sense to do so.

For example, a RacingMenuComponent could wrap around a generic MenuComponent.

## Screens

Screens should be placed in the `dev.mcarr.neds.ui.screens` package.

Each screen should take a viewmodel as an argument.

The screen should not pass the viewmodel to its components.

## Viewmodels

Viewmodels should receive data from UseCase classes in the :domain module.

The viewmodel is responsible for pulling data from the UseCase, and exposing the data as a Flow for the UI.