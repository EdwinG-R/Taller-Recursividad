package primerpunto;

import java.util.Scanner;

public class EntradaDatos {
    public int leerDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();
        teclado.close();
        return numero;
    }

}
