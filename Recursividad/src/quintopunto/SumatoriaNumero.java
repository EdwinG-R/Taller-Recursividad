package quintopunto;

public class SumatoriaNumero {
    public int calcular(int numero){
        if (numero == 0) {
            return 0;
        }
        return numero + calcular(numero-1);
    }
}   
