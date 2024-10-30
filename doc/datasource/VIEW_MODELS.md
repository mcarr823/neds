# ViewModel classes

* `:ui` module
* `dev.mcarr.neds.ui.viewmodels` package

ViewModel classes act as companions to screens within the app. They provide data to the UI, and functions which the UI can call.

A viewmodel may store data from the UI so that it is kept after recomposition. For example, if the user rotates their phone, triggering an orientation change.

The viewmodel should also contain most (if not all) of the logic used by a screen.

The composables within a screen should not be passed the viewmodel as a parameter. Instead, they should be constructed by using the data from within the viewmodel.

## Example

```kotlin
fun MyComponent(heading: String){
    Text(heading)
}

fun MyScreen(model: MyViewModel){

    var heading by remember { model.heading }
    
    MyComponent(heading)
    
}

class MyViewModel : ViewModel(){
    val heading = mutableStateOf("Default Heading")
}
```

In this example, the viewmodel contains a mutable string to be displayed on the UI.

The screen takes a viewmodel as an argument, then binds to the mutable string.

The screen then passes that string to a component to be displayed.

Like so, the viewmodel contains the underling data (the string to display), the screen accesses that data by a delegate property, and the component displays the string.

This way the component doesn't know about the viewmodel. It only knows (and only needs to know) how to display a string.

And if the string changes within the viewmodel, the component will be updated automatically.
