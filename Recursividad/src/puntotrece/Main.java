package puntotrece;

public class Main {
    public static void main(String[] args) {
        LeerDatos datos = new LeerDatos();
        CalcularSerieAkerman serie = new CalcularSerieAkerman();
        ImprimirDatos imprimir = new ImprimirDatos();

        int numeroM = datos.leerM();
        int numeroN = datos.leerN();

        long resultado = serie.calculo(numeroM, numeroN);
        imprimir.imprimirResultado(numeroM, numeroN, resultado);

    }
}
