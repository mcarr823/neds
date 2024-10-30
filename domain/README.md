# :domain module

The :domain module contains business logic which is applied to the data layer.

It primarily sits between the :data and :ui modules.

For example, data retrieved from the :data module will be manipulated by the :domain module before being exposed to the :ui module.

## Module dependencies

- :common
- :data
- :mock

## Use cases

Classes in the :domain package should be provided as Get*UseCase classes.

eg. If you want to expose and manipulate RacingData, you would create a GetRacingDataUseCase class.

Each use case should take a *Repository class from the :data module.

The repository should then provide data to the UseCase.

## More information

Check the doc folder for more detail on these classes, including examples of their usage and how they fit into the app overall.