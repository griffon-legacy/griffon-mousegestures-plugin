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

import griffon.mousegestures.factory.MouseGesturesFactory

/**
 * @author Andres Almiray
 */
class MousegesturesGriffonAddon {
    Map factories = [
        mouseGestures: new MouseGesturesFactory()
    ]
}
