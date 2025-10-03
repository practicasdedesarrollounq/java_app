package example.micronaut;

public class Service {


    public String token = "Mi password super  secreto";

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



/*
    public void codigoComentado() {
        System.out.println("tirar los logs a sys out no es muy bueno");

    }
*/
}
