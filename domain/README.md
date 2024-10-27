# :domain module

The :domain module contains business logic which is applied to the data layer.

It primarily sits between the :data and :ui modules.

For example, data retrieved from the :data module will be manipulated by the :domain module before being exposed to the :ui module.

## Package structure

The package for the :domain module is `dev.mcarr.neds.domain`.

A separate package should be created for each type of event.

eg. `dev.mcarr.neds.domain.racing` for any classes related to racing.

## Use cases

Classes in the :domain package should be provided as Get*UseCase classes.

eg. If you want to expose and manipulate RacingData, you would create a GetRacingDataUseCase class.

Each use case should take a *Repository class from the :data module.

The repository should then provide data to the UseCase.