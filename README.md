
Additional SWT layouts
----------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/layouts-swt](http://artifacts.griffon-framework.org/plugin/layouts-swt)


Delivers additional [layouts for SWT][1] created by [Scott Stanchfield][2]. These are ports of AWT layout managers for use in SWT

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*        | *Type*                                  |
| ------------- | --------------------------------------- |
| jborderLayout | `com.javadude.swt.layouts.BorderLayout` |
| jflowLayout   | `com.javadude.swt.layouts.FlowLayout`   |
| jgridLayout   | `com.javadude.swt.layouts.GridLayout`   |

These layouts can be used exactly as their AWT counterparts. In the case of `jborderLayout` you must specify additional constraints
using `layoutData:`, as the following example shows

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
[2]: http://www.javadude.com/index.html

