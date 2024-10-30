# :common module

The :common module contains generic, broadly useful classes  or data types which are needed across multiple other modules.

It should be depended on by most other modules.

The types of classes which belong in this module include:

- interfaces  
- enums
- data classes

## Module dependencies

N/A

This module does not and should not rely on any other modules.

If you want to include something in the :common module, but it relies on another module, then you should look at either moving that dependency into the :common module as well, or creating an interface and putting the interface in the :common module instead.