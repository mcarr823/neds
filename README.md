# Neds

[![Compile app and run unit tests](https://github.com/mcarr823/neds/actions/workflows/compile.yml/badge.svg)](https://github.com/mcarr823/neds/actions/workflows/compile.yml)


This is an example app for retrieving and displaying data from the Neds API.

## Modules

| Module |    Type     | Role                                          |
|:-------|:-----------:|:----------------------------------------------|
| app    | application | Neds application                              |
| common |   library   | Generic classes used across multiple modules  |
| net    |   library   | Network layer. HTTP client and URI classes    |
| ui     |   library   | UI later. Composables, themes, viewmodels     |
| data   |   library   | Data layer. DataSource and Repository classes |
| domain |   library   | Domain later. UseCase classes, business logic |

## Documentation

Each module contains a README file in its directory which further explains its usage, provides examples, and so on.

Additional instructions on how to develop the application can also be found [in the doc directory](doc/README.md).
