package onceavopunto;

public class CalcularSuma {
     public int sumar(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }
        if (columna == matriz[fila].length) {
            return sumar(matriz, fila + 1, 0);
        }
        return matriz[fila][columna] + sumar(matriz, fila, columna + 1);
    }
}
