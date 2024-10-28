# Networking

Networking in the Neds app relies on HTTP requests being built and performed by the :net module.

Implementations of the :net class should be encapsulated by DataSource classes in the :data module.

A typical implementation of an API endpoint will look something like this:
- :common module defines the API endpoint, path, etc. in `dev.mcarr.neds.common.enums.http`
- :common module defines the expected response data in `data class` objects in the `dev.mcarr.neds.data.classes` package
- :data module defines a data source for querying that data in `dev.mcarr.neds.data.datasources`

That DataSource class might then be built upon further to make the data more useful for the app.

See the [Data Sources](../datasource/README.md) doc for more information.

1. [Building URLs](BUILD_URL.md)
2. [Defining query parameters](QUERY_PARAMETERS.md)
3. [Changing the URL structure](URL_STRUCTURE.md)
4. [Performing HTTP requests](HTTP_REQUEST.md)
5. [Response data](RESPONSE_DATA.md)