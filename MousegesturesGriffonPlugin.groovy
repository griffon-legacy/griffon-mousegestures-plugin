/*
 * griffon-mouseguestures: MouseGestures Griffon plugin
 * Copyright 2010-2012 and beyond, Andres Almiray
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  griffon-mouseguestures is also
 * available under typical commercial license terms - see
 * smartclient.com/license.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

/**
 * @author Andres Almiray
 */
class MousegesturesGriffonPlugin {
    // the plugin version
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'GNU LGPL 2.1'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-mousegestures-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Recognize simple mouse gestures'
    String description = '''
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
'''
}
