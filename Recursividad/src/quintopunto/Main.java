package quintopunto;

import tercerpunto.LeerDatos;

public class Main {
    public static void main(String[] args) {
        LeerDatos datos = new LeerDatos(); // uso la clase de entrada de datos de la clase anterior
        ImprimirResultados imprimir = new ImprimirResultados();
        SumatoriaNumero calcular = new SumatoriaNumero();

        int numero = datos.entradaDatos();
        int resultado = calcular.calcular(numero);
        imprimir.resultado(numero, resultado);
    }
}
