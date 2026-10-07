package decimopunto;

public class CalcularMultiplicacion {
    public  int multiplicar(int multiplicando,int multiplicador ){
        if (multiplicador == 0){
            return 0;
        }
        return multiplicando + multiplicar(multiplicando, multiplicador - 1);
    }
}
