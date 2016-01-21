/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package com.example;

import java.util.HashMap;

import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestReporter;

public class ReportingTestCase {

	@Test
	void testWithReporting(TestReporter testReporter) {

		HashMap<String, String> values = new HashMap<>();
		values.put("user name", "dk38");
		values.put("award year", "1974");

		testReporter.publishEntry(values);

	}

}
