package onceavopunto;

import java.util.Random;

public class LlenarMatriz {

    private  Random aleatorio = new Random();

   public int[][] crear (int filas, int columnas){
        return llenar (new int[filas][columnas],0,0);

   }

   public  int [][] llenar (int[][] matriz,int filas, int columnas){
        if (filas == matriz.length) {
            return matriz;
        }
        if (columnas == matriz[filas].length) {
            return llenar(matriz, filas + 1,0);
        }
        matriz[filas][columnas] = aleatorio.nextInt(100);
        return llenar(matriz, filas, columnas + 1 );

   }
}
