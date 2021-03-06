/*
 * Copyright  2002-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Vector;
import java.util.Enumeration;
import org.apache.tools.ant.BuildFileTest;
import org.apache.tools.ant.Project;

/**
 * Testcase for the Signjar task
 *
 */
public class SignJarTest extends BuildFileTest {

    public static final String EXPANDED_MANIFEST
        = "src/etc/testcases/taskdefs/manifests/META-INF/MANIFEST.MF";

    public SignJarTest(String name) {
        super(name);
    }

    public void setUp() {
        configureProject("src/etc/testcases/taskdefs/signjar.xml");
    }

    public void tearDown() {
        executeTarget("clean");
    }

    public void testBasicSigning() {
        executeTarget("basic");
    }

    public void testSigFile() {
        executeTarget("sigfile");
    }

    public void testMaxMemory() {
        executeTarget("maxmemory");
    }

    public void testURLKeystoreFile() {
        executeTarget("urlKeystoreFile");
    }

    public void testURLKeystoreHTTP() {
        executeTarget("urlKeystoreHTTP");
    }
}
