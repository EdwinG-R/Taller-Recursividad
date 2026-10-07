package octavopunto;

public class Main {
    public static void main(String[] args) {
        LeerDatos datos = new LeerDatos();
        CopiarCadena cadena = new CopiarCadena();
        ImprimirResultado imprimir = new ImprimirResultado();

        String textoOriginal = datos.leerCadena();
        String copia = cadena.copiar(textoOriginal);

        imprimir.imprimirdatos(textoOriginal, copia);
    }
}
