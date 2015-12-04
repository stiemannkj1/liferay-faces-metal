/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.metal.component.commandbutton.internal;
//J-

import javax.annotation.Generated;

import com.liferay.faces.metal.component.button.internal.AbstractButtonRenderer;

import com.liferay.faces.metal.component.commandbutton.CommandButton;


/**
 * @author	Bruno Basto
 * @author	Kyle Stiemann
 */
@Generated(value = "com.liferay.alloy.tools.builder.FacesBuilder")
public abstract class CommandButtonRendererBase extends AbstractButtonRenderer {

	// Protected Constants
	protected static final String AJAX = "ajax";
	protected static final String AUTOFOCUS = "autofocus";
	protected static final String DISABLED = "disabled";
	protected static final String EXECUTE = "execute";
	protected static final String PROCESS = "process";
	protected static final String RENDER = "render";
	protected static final String STYLE_CLASS = "styleClass";
	protected static final String TYPE = "type";
	protected static final String UPDATE = "update";

	@Override
	public String getDelegateComponentFamily() {
		return CommandButton.COMPONENT_FAMILY;
	}

	@Override
	public String getDelegateRendererType() {
		return "javax.faces.Button";
	}
}
//J+
