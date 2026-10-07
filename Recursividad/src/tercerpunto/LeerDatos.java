package tercerpunto;

import java.util.Scanner;

public class LeerDatos {

    public int entradaDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese  un numero entero:");
        int numero = teclado.nextInt();
        teclado.close();
        return numero;
    
    }
    
}

