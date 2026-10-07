package octavopunto;

import java.util.Scanner;

public class LeerDatos {
    Scanner teclado = new Scanner(System.in);

    public String leerCadena(){
        System.out.println("Ingrese una  texto:");
        String cadena = teclado.nextLine(); 
        return cadena;
    }
}
