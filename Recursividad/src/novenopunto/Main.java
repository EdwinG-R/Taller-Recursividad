package novenopunto;

public class Main {
    public static void main(String[] args) {
        
        LectorDartos datos = new LectorDartos();
        CalcularCociente division = new CalcularCociente();
        ImprimirResultado imprimir = new ImprimirResultado();

        int dividendo = datos.dividendo();
        int divisor = datos.divisor();

        int cociente = division.calcular(dividendo, divisor);
        imprimir.imprimir(dividendo, divisor, cociente);
    }
}
