package primerpunto;

public class Main {
    public static void main(String[] args) {
        EntradaDatos datos = new EntradaDatos();
        CalcularFactorial calular = new CalcularFactorial();
        ImprimirResultado imprimirFactorial = new ImprimirResultado();

         int numero = datos.leerDatos();

            if(numero <0){
                    System.out.println("El factorial no se puede para numeros negativos:");
                    return;
            }
        int factorial = calular.factorial(numero);
        imprimirFactorial.imprimir(numero, factorial);
    }
}
