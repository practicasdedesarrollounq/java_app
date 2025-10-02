package example.micronaut;

public class Service {

    public void METODO(){
        String A = "";
        String b = "123";
        String c = "";
        String z =  A + b;


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
