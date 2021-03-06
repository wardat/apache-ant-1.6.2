/*
 * Copyright  2001,2004 The Apache Software Foundation
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

package org.apache.tools.ant.taskdefs.optional;

import java.io.*;
import org.apache.tools.ant.BuildFileTest;

/**
 */
public class PvcsTest extends BuildFileTest {

    public PvcsTest(String name) {
        super(name);
    }

    public void setUp() {
        configureProject("src/etc/testcases/taskdefs/optional/pvcs.xml");
    }

    public void test1() {
        expectBuildException("test1", "Required argument repository not specified");
    }

    public void test2() {
        executeTarget("test2");
    }

    public void test3() {
        executeTarget("test3");
    }

    public void test4() {
        executeTarget("test4");
    }

    public void test5() {
        executeTarget("test5");
    }

    public void test6() {
        expectBuildException("test6", "Failed executing: /never/heard/of/a/directory/structure/like/this/pcli lvf -z -aw -pr//ct4serv2/pvcs/monitor /. Exception: /never/heard/of/a/directory/structure/like/this/pcli: not found");
    }
}
