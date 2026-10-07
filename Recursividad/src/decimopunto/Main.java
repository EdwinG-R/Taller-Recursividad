package decimopunto;

public class Main {
    public static void main(String[] args) {
        
        LeerDatos datos = new LeerDatos();
        CalcularMultiplicacion operacion = new CalcularMultiplicacion();
        ImprimirResultados imprimir = new ImprimirResultados();

        int multiplicador = datos.multiplicador();
        int multiplicando = datos.multiplicando();

        int resultado = operacion.multiplicar(multiplicando, multiplicador);
        imprimir.imprimirResultado(multiplicador, multiplicando, resultado);
    }
}
