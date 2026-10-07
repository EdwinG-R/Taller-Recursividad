package doceavopunto;

public class CalcularFibonacci {
    public long calcular(int numero){
        if(numero == 0){
            return 0;
        }
        if(numero == 1){
            return 1;
        }
        return calcular(numero-1) + calcular(numero-2);
    }
    
}
