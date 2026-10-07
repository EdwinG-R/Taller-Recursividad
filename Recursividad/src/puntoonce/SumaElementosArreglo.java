package puntoonce;

public class SumaElementosArreglo {
    public  int sumar(int []datos, int indice){
        if (indice == datos.length) {
            return 0;
        }
        return datos[indice] + sumar(datos, indice +1);
    }
    
    public int sumar(int[] datos) {
        return sumar(datos, 0);
    }

}
