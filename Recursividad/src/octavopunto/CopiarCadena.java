package octavopunto;

public class CopiarCadena {

    public  String copiar (String origen){
        char[] destino = new char[origen.length()];
        copiaRecursiva(origen, destino, 0);
        return new String(destino);
    }

    public void copiaRecursiva(String origen, char[]destino,int indice){
        if (indice == origen.length()) {
            return;
        }

        destino[indice] = origen.charAt(indice);
        copiaRecursiva(origen, destino, indice + 1);
    }
}
