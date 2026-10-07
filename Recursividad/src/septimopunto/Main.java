package septimopunto;

public class Main {
    public static void main(String[] args) {
        
        EntradaDatos datos = new EntradaDatos();
        CalcularMCD calcular = new CalcularMCD();
        ImpresorResultados imprimir = new ImpresorResultados();

        int numeroM = datos.leerM();
        int numeroN = datos.leerN();

        if (numeroN > numeroM) {
            int temporal = numeroM;

            numeroM = numeroN;
            numeroN = temporal;
        }

        int mcd = calcular.calcular(numeroM, numeroN);
        imprimir.imprimir(numeroM, numeroN, mcd);
        
    }
}
