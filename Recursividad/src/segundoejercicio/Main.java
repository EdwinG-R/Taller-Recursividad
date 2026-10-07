package segundoejercicio;

public class Main {
    public static void main(String[] args) {
        EntradaDatos teclado = new EntradaDatos();
        Inversor numeroInvertido = new Inversor();
        ImprimirDatos imprimir = new ImprimirDatos();


        int numero = teclado.leerDatos();
        int invertido = numeroInvertido.invertirNumero(numero);
        if(numero <0){
        invertido = -invertido;
        }
        imprimir.ImprimirResultado(numero,invertido);
    }
    
}
