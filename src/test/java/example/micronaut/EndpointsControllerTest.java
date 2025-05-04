/*
 * Copyright 2017-2025 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.micronaut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndpointsControllerTest {

    EndpointsController controllerToTest;
    @BeforeEach
    void setUp() {
        controllerToTest = new EndpointsController();
    }

    @Test
    void one() {
        String result = controllerToTest.one();

        assertEquals("This is the endpoint 1", result);
    }

    @Test
    void two() throws InterruptedException {

        String result = controllerToTest.two();

        assertTrue(result.startsWith("This is the endpoint 2 [0"));
        assertTrue(result.endsWith("99]"));

    }
}