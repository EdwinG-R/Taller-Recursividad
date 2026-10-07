package novenopunto;

public class CalcularCociente {
    public int calcular (int dividendo, int divisor){
        if (dividendo < divisor) {
            return 0;
        }

        return 1 + calcular(dividendo - divisor, divisor);
    }
}
