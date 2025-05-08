/*
 * Copyright 2017-2024 original authors
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

import io.micrometer.core.annotation.Timed;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.ArrayList;
import java.util.List;

@Controller("/endpoints")
public class EndpointsController {


    @Get("/one")
    @Produces(MediaType.TEXT_PLAIN)
    @Timed("endpoints.one")
    public String one() {
        return "This is the endpoint 1";
    }

    @Get("/two")
    @Produces(MediaType.TEXT_PLAIN)
    @Timed("endpoints.two")
    public String two() throws InterruptedException {
        // waiting 100 milliseconds before answering
        Thread.sleep(100);

        StringBuilder response = new StringBuilder("This");
        response.append(" is");
        response.append(" the");
        response.append(" endpoint");
        response.append(" 2 [0");

        List<List<String>> listsOfArrays = new ArrayList<List<String>>(100);

        for (int i = 1; i < 100; i++) {
            response.append(", ");
            response.append(i);

            // added to consume more memory
            List<String> stringArrayList = new ArrayList<String>(100);
            for (int j = 0; j < 99; j++) {
                stringArrayList.add("some Str_" + i);
            }
            listsOfArrays.add(stringArrayList);
        }

        response.append("]");
        return response.toString();
    }

    @Get("/a")
    @Produces(MediaType.TEXT_PLAIN)
    @Timed("endpoints.a")
    public String a() {
        return "This is the endpoint A";
    }

}



