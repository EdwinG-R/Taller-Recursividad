package septimopunto;

import java.util.Scanner;

public class EntradaDatos {
    
    Scanner teclado = new Scanner(System.in);

    public int leerM (){
       
        System.out.println("Ingrese el valor de M ");
        int numero = teclado.nextInt();
        return numero;
    }

    public  int leerN(){
        System.out.println("Ingrese el valor de N ");
        int numeroN = teclado.nextInt();
        teclado.close();
        
        return numeroN;
    }
}
