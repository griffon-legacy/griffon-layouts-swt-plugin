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

import griffon.util.ApplicationHolder;
import groovy.swt.factory.LayoutFactory;
import org.codehaus.griffon.runtime.core.AbstractGriffonAddon;
import com.javadude.swt.layouts.*;

/**
 * @author Andres Almiray
 */
public class LayoutsSwtGriffonAddon extends AbstractGriffonAddon {
    public LayoutsSwtGriffonAddon() {
        super(ApplicationHolder.getApplication());
        factories.put("jborderLayout", new LayoutFactory(BorderLayout.class));
        factories.put("jflowLayout", new LayoutFactory(FlowLayout.class));
        factories.put("jgridLayout", new LayoutFactory(GridLayout.class));
    }
}
