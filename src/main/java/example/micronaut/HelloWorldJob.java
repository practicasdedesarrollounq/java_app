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

import io.micrometer.core.annotation.Counted;
import io.micronaut.scheduling.annotation.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.inject.Singleton;
import java.text.SimpleDateFormat;
import java.util.Date;

@Singleton 
public class HelloWorldJob {
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldJob.class); 

    @Scheduled(fixedDelay = "3s")
    @Counted()
    void executeEveryTen() {
        LOG.warn("Simple Job every 3 seconds: {}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date()));
    }

    @Scheduled(fixedDelay = "5s", initialDelay = "1s")
    @Counted()
    void executeEveryFourtyFive() {
        LOG.warn("Simple Job every 5 seconds: {}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date()));
    }
}