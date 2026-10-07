package cuartopunto;

import tercerpunto.LeerDatos;

public class Main {
    public static void main(String[] args) {
        LeerDatos datos = new LeerDatos(); // use la clase del ejercicio anterior para obtener el numero
        SumaDigitos suma = new SumaDigitos();
        ImprimirResultado imprimir = new ImprimirResultado();
        
        int numero = datos.entradaDatos();
        int sumatoriaDigitos = suma.suma(numero);
        imprimir.imprimirRespuesta(numero, sumatoriaDigitos);
    }
}
