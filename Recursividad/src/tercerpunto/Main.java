package tercerpunto;

public class Main {
    public static void main(String[] args) {
        CalcularSuma suma = new CalcularSuma();
        ImprimirResultados imprimir = new ImprimirResultados();
        LeerDatos entrada = new LeerDatos();

        int numero = entrada.entradaDatos();
        double sumatoria = suma.calcular((numero));
        imprimir.imprimir(numero, sumatoria);
    }
}
