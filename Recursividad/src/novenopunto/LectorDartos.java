package novenopunto;

import java.util.Scanner;

public class LectorDartos {
    Scanner teclado = new Scanner(System.in);

    public int dividendo(){
        System.out.println("Ingrese el dividendo");
        int numero = teclado.nextInt();
        return  numero;
    }

    public  int divisor(){
        System.out.println("Ingrese el divisor:");
        int divisor = teclado.nextInt();
        return  divisor;
    }
}
