/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.parameters;

import org.eclipse.xtext.parser.parameters.AbstractParametersParsingTest;
import org.eclipse.xtext.parser.parameters.ParametersTestLanguageExStandaloneSetup;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class ParametersParsingTestEx extends AbstractParametersParsingTest {
  @Override
  public void setUp() throws Exception {
    super.setUp();
    ParametersTestLanguageExStandaloneSetup _parametersTestLanguageExStandaloneSetup = new ParametersTestLanguageExStandaloneSetup();
    this.with(_parametersTestLanguageExStandaloneSetup);
  }
}
