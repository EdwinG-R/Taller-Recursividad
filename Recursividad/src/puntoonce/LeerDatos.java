package puntoonce;

import java.util.Scanner;

public class LeerDatos {
    Scanner teclado = new Scanner(System.in);
    public int[] leer(int numero){
        int[] datos = new int[numero];
        for(int i = 0; i< numero; i++){
            System.out.println("Ingrese un valor " + (i+1) + " : ");
            datos[i]= teclado.nextInt();

        }
        return datos;
    }
}
