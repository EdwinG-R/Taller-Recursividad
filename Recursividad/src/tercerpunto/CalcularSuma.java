package tercerpunto;

public class CalcularSuma {
    public double calcular(int numero){
        if (numero == 1) {
            return 1;
        }
        return (1.0 / numero) + calcular(numero -1);
    }
}
