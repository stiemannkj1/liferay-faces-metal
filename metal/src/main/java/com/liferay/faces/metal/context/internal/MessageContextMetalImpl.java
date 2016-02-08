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
package com.liferay.faces.metal.context.internal;

import com.liferay.faces.util.context.MessageContext;
import com.liferay.faces.util.context.MessageContextBundleBase;


/**
 * @author  Neil Griffin
 */
public class MessageContextMetalImpl extends MessageContextBundleBase {

	public MessageContextMetalImpl(MessageContext messageContext) {
		super(messageContext);
	}

	@Override
	public String getBundleKey() {
		return "i18n-metal";
	}
}