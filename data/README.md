# :data module

The :data module is responsible for retrieving and providing data from different data sources.

For example, it may provide data from a database, a network, or some other resource.

This module primarily provides two types of classes: DataSource and Repository classes.

## DataSource classes

DataSource classes provide data from a single endpoint.

For example, you could have a LocalDataSource class for pulling data from a database, and a NetworkDataSource for retrieving data from an online source.

A single DataSource class should only pull data from a single source, but it can pull data from that source in multiple ways.

eg. It could provide multiple methods for querying different data from the single source.

## Repository classes

A repository has a one-to-many relationship with data sources.

The Repository class acts as an intermediary between DataSource classes and other parts of the app.

If part of the app wants to retrieve data, it will talk to the repository, and the repository will then query the appropriate data source.