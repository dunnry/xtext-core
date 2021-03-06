/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.server

import com.google.inject.AbstractModule
import java.util.concurrent.ExecutorService
import org.eclipse.lsp4j.services.LanguageServer
import org.eclipse.xtext.ide.ExecutorServiceProvider
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.ResourceServiceProviderServiceLoader
import org.eclipse.xtext.resource.containers.ProjectDescriptionBasedContainerManager

/**
 * @author Sven Efftinge - Initial contribution and API
 * @since 2.11
 */
class ServerModule extends AbstractModule {
    
    override protected configure() {
		binder.bind(ExecutorService).toProvider(ExecutorServiceProvider)
		
    	bind(LanguageServer).to(LanguageServerImpl)
        bind(IResourceServiceProvider.Registry).toProvider(ResourceServiceProviderServiceLoader)
        bind(IWorkspaceConfigFactory).to(ProjectWorkspaceConfigFactory)
        bind(ProjectWorkspaceConfigFactory).to(MultiRootWorkspaceConfigFactory)
        bind(IProjectDescriptionFactory).to(DefaultProjectDescriptionFactory)
        bind(IContainer.Manager).to(ProjectDescriptionBasedContainerManager)
    }
}