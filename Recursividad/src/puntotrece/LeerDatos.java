package puntotrece;

import java.util.Scanner;

public class LeerDatos {
    Scanner teclado = new Scanner (System.in);

    public int leerM(){
        System.out.println("Ingresa el valor de M");
        int numeroM =teclado.nextInt();
        return numeroM;
    }

    public int leerN(){
        System.out.println("Ingrese el valor de N");
        int numeroN = teclado.nextInt();
        return numeroN;
    }
}
