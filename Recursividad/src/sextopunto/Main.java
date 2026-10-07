package sextopunto;

public class Main {
    public static void main(String[] args) {
        LeerDatos datos = new LeerDatos();
        CalcularPotencia calcular = new CalcularPotencia();
        ImprimirDatos imprimir = new ImprimirDatos();


        int numero = datos.leerBase();
        int exponente = datos.leerExponente();

        long resultado = calcular.calcular(numero, exponente);
        imprimir.imprimirResultado(numero, exponente, resultado);
    }
}
