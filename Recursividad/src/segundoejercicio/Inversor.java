package segundoejercicio;

public class Inversor {
    
    public int invertirNumero(int numero){
        return invertido(numero, 0);
    }

    private int invertido(int numero, int acumulado){
        if (numero == 0) {
            return acumulado;
        }
        return invertido(numero / 10, acumulado * 10+ numero % 10);
    }

}
