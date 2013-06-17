
Recognize simple mouse gestures
-------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/mousegestures](http://artifacts.griffon-framework.org/plugin/mousegestures)


Recognize simple mouse gestures with [MouseGestures][1].

Usage
-----

The following methods become available on View scripts upon installing this plugin

| *Node*       | *Property*  | *Type*  | *Default*                | *Bindable* |
| ------------ | ----------- | ------- | ------------------------ | ---------- |
| mouseGestures| start       | boolean |                          | no         |
|              | mouseButton | int     |`MouseEvent.BUTTON1_MASK` | no         |

Instances of `MouseGesturesListener` are responsible for processing the recognized gestures. There's a default listener
registered with the `mouseGestures node`. You can use it in this way

    mouseGestures(start: true) {
        // receives gestures as they are recognized (cummulative)
        onGestureMovementRecognized { String s -> println s }
        // the final recognized gesture
        onProcessGesture { String s -> println "<< $s >>" }
    }

MouseGestures are recognized anywhere in your app, be sure to turn them off when you no longer needed them.

[1]: http://www.smardec.com/products/mouse-gestures.html

