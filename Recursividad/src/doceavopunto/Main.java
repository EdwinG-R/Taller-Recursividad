package doceavopunto;

public class Main {
    public static void main(String[] args) {
        LeerDatos datos = new LeerDatos();
        CalcularFibonacci calculo = new CalcularFibonacci();
        ImprimirResultado imprimir = new ImprimirResultado();

        int numero = datos.limite();
        imprimir.imprimir(numero, calculo);
    }
}
