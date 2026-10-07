package sextopunto;

public class CalcularPotencia {
    public  int calcular (int base, int exponente){
        if (exponente == 0){
            return 1;
        }
        return base * calcular(base, exponente -1);
    }
}
