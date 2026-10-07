package onceavopunto;

import java.util.Scanner;

public class LeerDatos {
    Scanner teclado = new Scanner(System.in);
    public int llenarFilas(){
        System.out.println("Ingrese la cantidad de filas (m)");
        int filas = teclado.nextInt();
        return filas;
    }

    public  int llenarColumnas(){
        System.out.println("Ingrese la cantidad de columnas (n)");
        int columnas = teclado.nextInt();
        return columnas;
    }
}

