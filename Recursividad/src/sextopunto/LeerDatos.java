package sextopunto;

import java.util.Scanner;

public class LeerDatos {
    Scanner teclado = new Scanner(System.in);
    public int leerBase(){
        
        System.out.println("Ingrese la base : ");
        int numero = teclado.nextInt();
        return numero;
    }

    public int leerExponente(){
        
        System.out.println("Ingrese la potencia a la que quiere elevar  el numero anterior: ");
        int exponente = teclado.nextInt();
        teclado.close();
        return exponente;
    }
}
