//import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        
        System.out.println("Hola Mundo");
        Pajaro pepita = new Pajaro(100);
        pepita.comer();
        pepita.volar();  
        System.out.println("La energia del Zorzal es: "+pepita.energia());
        Zorzal zorzal = new Zorzal(85);
        zorzal.cantar();
        System.out.println("La energia del Zorzal es: "+zorzal.energia());    
        Buho buho = new Buho();
        buho.cantar();    
        Integer numero = new Integer(10);
        System.out.println(numero);
        Integer otroNumero = 20;
        System.out.println(otroNumero);
        Integer sinNumero = null;
        System.out.println(sinNumero);
     }
}
