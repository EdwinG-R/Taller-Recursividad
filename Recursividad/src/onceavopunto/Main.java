package onceavopunto;

public class Main {
    public static void main(String[] args) {
        LeerDatos datos = new LeerDatos();
        LlenarMatriz crear = new LlenarMatriz();
        CalcularSuma operacion = new CalcularSuma();
        ImprimirResultados imprimirResultados = new ImprimirResultados();


        int filas = datos.llenarFilas();
        int columnas = datos.llenarColumnas();

        int[][] matriz = crear.crear(filas, columnas);
        int suma = operacion.sumar(matriz, 0,0);
        imprimirResultados.imprimirMatriz(matriz);
        imprimirResultados.imprimirResultado(filas, columnas, suma);
    }
}
