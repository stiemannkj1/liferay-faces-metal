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
package com.liferay.faces.metal.application.internal;

import com.liferay.faces.util.application.ResourceDependencyVerifier;
import com.liferay.faces.util.application.ResourceDependencyVerifierFactory;

/**
 * @author  Kyle Stiemann
 */
public class ResourceDependencyVerifierFactoryMetalImpl extends ResourceDependencyVerifierFactory {

	// Private Members
	private ResourceDependencyVerifierFactory wrappedResourceDependencyVerifierFactory;

	public ResourceDependencyVerifierFactoryMetalImpl(ResourceDependencyVerifierFactory wrappedResourceDependencyVerifierFactory) {
		this.wrappedResourceDependencyVerifierFactory = wrappedResourceDependencyVerifierFactory;
	}

	@Override
	public ResourceDependencyVerifier getResourceDependencyVerifier() {

		ResourceDependencyVerifier resourceDependencyVerifier = wrappedResourceDependencyVerifierFactory.getResourceDependencyVerifier();
		return new ResourceDependencyVerifierMetalImpl(resourceDependencyVerifier);
	}

	@Override
	public ResourceDependencyVerifierFactory getWrapped() {
		return wrappedResourceDependencyVerifierFactory;
	}
}
