package example.micronaut;


import java.util.Arrays;
import java.util.List;
import java.util.Set;


// unnecesary imports
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

public class SonarProblems {


    public void doA(String some) {
        doSomething("action1");
        doSomething("action2");
        doSomething("action3");
    }

    public void doADuplicated(String some) {
        doSomething("action1");
        doSomething("action2");
        doSomething("action3");
    }


    public void doSomething(String some) {
        String thing = "ABC";
        //TODO  should not left TODOS in code

        if (thing != some) {
            //TODO  should not check by !=
            System.out.println("printing some: " + some);
        }
    }


    public void commentedCode(String x) {

        String test = "               ----------------------------------- this is a very long string for a single line --------------------------";
        if (test.equals(x)) {   System.out.println("printing x: " + x);  }


        doSomething("test");
//        doSomething("action1");
//        doSomething("action1");
//        doSomething("action1");
//        doSomething("action1");

    }


    private void stringLiteralDuplicated() {

        doSomething("action1");
        doSomething("action1");
        doSomething("action1");

    }

    private void unusedElements() {
        String some = "10"; //assignment not used
        doSomething("123");
    }


    private void cognitiveComplexity() {
        int a = 10;
        if (a > 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a != 4) {
                            if (a != 5) {
                                if (a != 6) {
                                    if (a != 7) {
                                        if (a != 8) {
                                            if (a != 9) {
                                                if (a < 11) {
                                                    System.out.println("a es 10");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void rawTypes() {
        List aList;
        Set aSet;

        aList = Arrays.asList("a", "b", "c");
        aSet = Set.of("a", "b", "c");

    }


    public void genericException(String bar) throws Exception {
        if (bar.isEmpty()) {
            throw new Exception();
        }
        if (bar == "jello") {
            throw new Exception();
        }
        System.out.println("This is bar: " + bar);
    }

}
