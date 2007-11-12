/* Radio.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2007/08/16  18:10:17 , Created by Dennis.Chen
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.jsf.zul;

import org.zkoss.jsf.zul.impl.BranchComponent;
import org.zkoss.zk.ui.Component;

/**
 * Radio is a JSF component implementation for {@link org.zkoss.zul.Radio}, 
 * 
 * This component should be declared nested under {@link org.zkoss.jsf.zul.Page}.
 * 
 * Note : This component doen't implements ValueHolder, that means you can't bind it to a bean value for user input.
 * To bind raido value to bean for user input, please use {@link Radiogroup}   
 * 
 * 
 * <p/>To know more ZK component features you can refer to <a href="http://www.zkoss.org/">http://www.zkoss.org/</a>
 *   
 * @author Dennis.Chen
 *
 */
public class Radio extends BranchComponent {


	protected Component newComponent(Class use) throws Exception {
		return (Component) (use==null?new org.zkoss.zul.Radio():use.newInstance());
	}
	
	
}
