# App Concepts

At a high level, some of the common concepts, patterns, etc. utilized in this app include:
- Flows for reactive user interfaces
- Separation of responsibilities across different layers (data, domain, ui, etc.)
- Coroutines and suspending functions for async/background work
- Serialization for automatic conversion of network responses to data objects

It also attempts to adhere to the following principles:
- DRY (Don't Repeat Yourself) - use interfaces or abstract classes wherever it makes sense. eg. For mocking/testing classes
- SOLID - classes are designed as single-purpose and made with extensibility in mind 