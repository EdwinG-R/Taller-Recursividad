package septimopunto;

public class CalcularMCD {
    public  int calcular (int m, int n){
        if (n == 0) {
            return m;
        }
        return  calcular(n, m % n);
    }
}
