# MVVM and data

Data traverses several modules, layers, and classes throughout the app.

Generally speaking, this will involve:

- the back-end data class/layer. This could be a network resource, a database, or some other data store.
- a DataSource class in the :data module for retrieving that data
- a Repository class in the :data module, providing a one-to-many relationship to one or more data sources
- a UseCase class in the :domain module which applies business logic to the data from the repository
- a ViewModel class in the :ui module for taking the data from the UseCase class
- a composable in the :ui module which displays the data from the viewmodel

Some of those may be omitted depending on what you are querying, how, and what it's being used for.

1. [DataSources](DATA_SOURCES.md)
2. [Repositories](REPOSITORIES.md)
3. [UseCases](USE_CASES.md)
4. [ViewModels](VIEW_MODELS.md)