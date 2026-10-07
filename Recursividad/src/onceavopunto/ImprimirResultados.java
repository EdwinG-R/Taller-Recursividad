package onceavopunto;


public class ImprimirResultados {
    public void imprimirMatriz(int[][] matriz) {
        System.out.println("La matriz generada es:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
 
    public void imprimirResultado(int filas, int columnas, int suma) {
        System.out.println("La suma de los elementos de la matriz de " + filas + " X " + columnas + " es " + suma);
    }

}
