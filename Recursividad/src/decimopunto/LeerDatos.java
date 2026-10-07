package decimopunto;

import java.util.Scanner;

public class LeerDatos {
    Scanner teclado = new Scanner(System.in);

    public int multiplicando (){
        System.out.println("Ingrese el multiplicando ( --- x 30 )");
        int numero = teclado.nextInt();
        return numero;
    }

    public int multiplicador (){
        System.out.println("Ingrese el multiplicador: (30 x ----) ");
        return teclado.nextInt();
    }
}
