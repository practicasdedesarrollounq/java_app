package example.micronaut;


import java.util.*;
import example.micronaut.EndpointsController;

public class Service {


    public static final String TOKEN = "7cd874b1-6242-4186-a5e3-dbf767595434";

    public String mi_token = "Mi password super  secreto";

    public static final String passowrd = "Mi password super  secreto";

    public void METODO(){
        String A = "";
        String b = "123";
        String c = "";
        String z =  A + b;


        int zero = 0;
        int a = 123;
        var b = a / zero;
    }

    public void calculo(){

        int zero = 0;
        int a = 123;
        var b = a / zero;

        System.out.println("tirar los logs a sys out no es muy bueno" + b);
    }


    //@SuppressWarnings("java:S106")
    public void otroMetodo() {
        System.out.println("tirar los logs a sys out no es muy bueno");

    }

    //@SuppressWarnings("java:S106")
    public void loop() {
        int x = 100;
        for (int i = 0; i < x; i++) {
            System.out.println("loop");
            x = i + 2;
        }

    }


    public boolean ifAnidados() {
        int zero = 0;
        int a = 123;

        if (a > 1) {
            if (a > 2 ) {
                if (a > 3 ) {
                    if (a > 4 ) {
                        if (a > 5 ) {
                            if (a > 6 ) {
                                if (a > 7 ) {
                                    if (a > 8 ) {
                                        if (a > 9 ) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    return false;
    }


/*
    public void codigoComentado() {
        System.out.println("tirar los logs a sys out no es muy bueno");

    }
*/
}
