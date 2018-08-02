package ejpoo;

import java.util.Scanner;

public class Dataherencia extends Data {
    private int celular;
    private Scanner lector;

    public Dataherencia() {
    }
    
    
    public Dataherencia(int celular) {
        this.celular = celular;
    }   
    
    public void datos(){
        lector = new Scanner (System.in);
        System.out.println("Digite numero de celular: ");
        celular = lector.nextInt();   
        System.out.println("Celular "+celular);
    }
}
