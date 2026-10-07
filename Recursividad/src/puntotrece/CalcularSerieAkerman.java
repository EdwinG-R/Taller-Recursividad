package puntotrece;

public class CalcularSerieAkerman {
    public  int calculo(int m, int n){
        if (m == 0) {
            return n+1;
        }
        if (n == 0) {
            return  calculo(m - 1, 1);
        }
        return calculo(m -1, calculo(m, n-1));
    }
}
