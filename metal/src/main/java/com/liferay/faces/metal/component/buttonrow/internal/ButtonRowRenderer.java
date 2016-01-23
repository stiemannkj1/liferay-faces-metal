/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.metal.component.buttonrow.internal;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.render.FacesRenderer;

import com.liferay.faces.metal.component.buttonrow.ButtonRow;


/**
 * @author  Vernon Singleton
 */
//J-
@FacesRenderer(componentFamily = ButtonRow.COMPONENT_FAMILY, rendererType = ButtonRow.RENDERER_TYPE)
@ResourceDependencies(
	{
		@ResourceDependency(library = "liferay-faces-metal-reslib", name = "css/bootstrap.min.css"),
		@ResourceDependency(library = "liferay-faces-metal", name = "metal.css")
	}
)
//J+
public class ButtonRowRenderer extends ButtonRowRendererBase {
	// Initial Generation
}
