# Components

- `:ui` module
- `dev.mcarr.neds.ui.components` package

Components in this app are divided up into two categories: generic or event-specific.

## Generic components

Components which aren't specific to a single screen or feature within the Neds app should be placed in the `base` package.

For example, if you create a MenuComponent which could be used on several different screens, it belongs in the `base` package.

A generic component should be used as the basis for an event-specific component wherever there is sufficient overlap.

## Event-specific components

Components which pertain to a specific type of event (eg. racing) should be placed in their own package.

These components should build upon generic components wherever it makes sense to do so.

For example, a RacingMenuComponent could wrap around a generic MenuComponent.

## Example

```kotlin
@Composable
fun TitleCard(title: String, body: String){
    Card(onClick = {}){
        Column{
            Text(title)
            Text(body)
        }
    }
}

@Composable
fun RacingCard(race: Race){
    TitleCard(
        title = race.name,
        body = race.summary
    )
}
```

TitleCard is a generic component, since it doesn't include anything specific to a given screen or app function.

RacingCard is event-specific, since it directly relates to a racing event.
