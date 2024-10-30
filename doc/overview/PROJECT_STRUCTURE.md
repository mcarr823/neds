# Project Structure

## Modules

This app currently contains the following modules:
- :app
- :net
- :ui
- :mock
- :common
- :data
- :domain

## General overview

Each module contains a README.md file which explains its purpose.

As a general overview, however:
- :common module provides generic classes which are broadly useful for other modules
- :mock module provides test data, used for unit tests and UI previews
- :net module handles network-specific logic/classes
- :data module leverages the :net module to retrieve data from external sources
- :domain module leverages the :data module to retrieve data, to which it then applies business logic
- :ui module contains viewmodels which utilize the :domain layer to retrieve data, and also components to display that data
- :app module provides the actual application (Activity) which displays the :ui module components

More information on each of these can be found either in the module's own README, or other sections of the documentation.

## Division of responsibilities

Note that the responsibilities of some sections may overlap somewhat, or not be completely clear-cut.

For example, UseCase classes in the :domain layer and ViewModel classes in the :ui layer both apply business logic to data.

These instances should be few and far between, but keep this in mind if you are working on a class and notice something which should be moved elsewhere.