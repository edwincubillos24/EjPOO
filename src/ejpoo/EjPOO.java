package ejpoo;

import java.util.Scanner;

public class EjPOO {
    
    public static void main(String[] args) {
        Data objeto1 = new Data();
        objeto1.inicializar();
        objeto1.imprimir();
        
        Dataherencia objeto2 = new Dataherencia();
        objeto2.inicializar();
        objeto2.imprimir();
        objeto2.datos();
    }    
}
