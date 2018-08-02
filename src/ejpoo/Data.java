package ejpoo;

import java.util.Scanner;

public class Data {
    private String nombre;
    private int edad;
    private Scanner lector;
    
    public void inicializar(){
        lector = new Scanner(System.in);
        System.out.println("Digite nombre");
        nombre=lector.next();
        System.out.println("Digite edad");
        edad=lector.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad);
    }
}
