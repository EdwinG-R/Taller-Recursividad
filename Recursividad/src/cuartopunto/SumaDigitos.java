package cuartopunto;

public class SumaDigitos {
    public int suma(int numero ){
        if (numero == 0) {
            return  0;
        }
        return numero % 10 + suma(numero / 10);
    }
}
