package doceavopunto;

import java.util.Scanner;

public class LeerDatos {
    Scanner teclado = new Scanner (System.in);
    public int limite(){
        System.out.println("Ingrese el numero limite hasta el cual se va a calcular la serie fibonacci");
        int numero = teclado.nextInt();
        return numero;
    }
    
}
