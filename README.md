# Neds

[![Compile app and run unit tests](https://github.com/mcarr823/neds/actions/workflows/compile.yml/badge.svg)](https://github.com/mcarr823/neds/actions/workflows/compile.yml)
[![Javadoc](https://github.com/mcarr823/neds/actions/workflows/publish-javadoc.yml/badge.svg)](https://github.com/mcarr823/neds/actions/workflows/publish-javadoc.yml)

This is an example app for retrieving and displaying data from the Neds API.

It provides a basic implementation of the Next To Go screen from the Neds app.

## Modules

| Module |    Type     | Role                                          |
|:-------|:-----------:|:----------------------------------------------|
| app    | application | Neds application                              |
| common |   library   | Generic classes used across multiple modules  |
| net    |   library   | Network layer. HTTP client and URI classes    |
| ui     |   library   | UI later. Composables, themes, viewmodels     |
| data   |   library   | Data layer. DataSource and Repository classes |
| domain |   library   | Domain later. UseCase classes, business logic |
| mock   |   library   | Mock data/classes for previews, testing       |

## Documentation

Each module contains a README file in its directory which a brief explanation of its usage.

Most documentation, however, is found [in the doc directory](doc/README.md).

There is also javadoc provided in each class, which is compiled automatically and deployed to a website [available here](https://mcarr823.github.io/neds/).

## Workflows

This repository contains two CI tasks:
1. a task to compile the app and run all of its unit tests
2. a task to compile its documentation and deploy it to GitHub Pages
