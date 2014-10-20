/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.util;

import java.util.Collection;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 * @since 2.8
 */
public class CollectionBasedAcceptor<T> implements IAcceptor<T> {
	public static <X> CollectionBasedAcceptor<X> of(Collection<? super X> collection) {
		return new CollectionBasedAcceptor<X>(collection);
	}

	private final Collection<? super T> collection;

	private CollectionBasedAcceptor(Collection<? super T> collection) {
		super();
		this.collection = collection;
	}

	public void accept(T t) {
		collection.add(t);
	}

	@Override
	public String toString() {
		return collection.toString();
	}

}