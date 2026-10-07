package doceavopunto;

public class ImprimirResultado {
    public void imprimir(int limite, CalcularFibonacci calculo){
        System.out.println("Serie fibonacci hasta " + limite + " : ");
        for(int i = 0; i <= limite; i++){
            System.out.print(calculo.calcular(i) + "  ");
        }
        System.out.println();
    }
}
