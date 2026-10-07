package puntoonce;

public class ImprimirResultados {

    public  void imprimirArreglo(String titulo, int[]datos){
        System.out.println(titulo + " : ");
        for(int numero : datos){
            System.out.print(numero + " : ");
        }
        System.out.println();
    }

    public void imprimirSuma(int suma){
        System.out.println("La suma de los vectores es: " + suma);
    }
}
