package puntoonce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos valores desea ingresar (n)? ");
        int n = teclado.nextInt();
 
        LeerDatos datos = new LeerDatos();
        SumaElementosArreglo calculo = new SumaElementosArreglo();
        ImprimirResultados imprimir = new ImprimirResultados();
 
        int[] numeros = datos.leer(n);
        imprimir.imprimirArreglo("Valores ", numeros);;
 
        int sumaVectores = calculo.sumar(numeros);
        imprimir.imprimirSuma(sumaVectores);
        teclado.close();
    }
    
}
