# :app module

The :app module contains any classes which directly relate to starting the application itself.

This includes:
- the main (and only) Activity
- the navigation component
- the app manifest, icon, and other sources

Most other classes should remain separate from this module.

There is some slight overlap in responsibilities with the :ui module, since both classes contain UI elements.

However, the :app module elements are only usable within the context of starting and running the app, whereas the :ui elements aim to be more portable and app-agnostic.

## Module dependencies

- :common
- :data
- :domain
- :ui

## Concepts

The app module displays a single Activity, which contains a single composable.

That composable contains a NavHost for navigating between different screens.

Each destination route of the NavHost is represented as a data class in the :data module.

Each destination composable is represented by a screen composable in the :ui module.

Currently this app contains only one screen. But any future screens should follow the same concept.