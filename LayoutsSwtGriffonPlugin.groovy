/*******************************************************************************
 * Copyright (c) 2012 Andres Almiray
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Andres Almiray - initial implementation
 *******************************************************************************/

class OpalGriffonPlugin {
    // the plugin version
    String version = '0.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.1.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swt: '1.1.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Eclipse Public License 1.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, qt
    List toolkits = ['swt']
    List platforms = []
    String documentation = ''
    String source = 'https://github.com/griffon/griffon-layouts-swt-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Additional SWT layouts'
    String description = '''
Delivers additional layouts created by Scott Stanchfield. These are ports of AWT layout managers for use in SWT

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*        | *Type*                                  |
| ------------- | --------------------------------------- |
| jborderLayout | `com.javadude.swt.layouts.BorderLayout` |
| jflowLayout   | `com.javadude.swt.layouts.FlowLayout`   |
| jgridLayout   | `com.javadude.swt.layouts.GridLayout`   |

These layouts can be used exactly as their AWT counterparts. In the case of `jborderLayout` you must specify additional constraints
using `layoutData:`, as the follwojg example shows

    import com.javadude.swt.layouts.BorderLayout
    application(text: 'Layouts', size:[200, 200]) {
        jborderLayout()
        button('NORTH',  layoutData: BorderLayout.NORTH)
        button('SOUTH',  layoutData: BorderLayout.SOUTH)
        button('WEST',   layoutData: BorderLayout.WEST)
        button('EAST',   layoutData: BorderLayout.EAST)
        button('CENTER', layoutData: BorderLayout.CENTER)
    }

[1]: http://www.javadude.com/tools/swtawtlayouts/index.html
'''
}
