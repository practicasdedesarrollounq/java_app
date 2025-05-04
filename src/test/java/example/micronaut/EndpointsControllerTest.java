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