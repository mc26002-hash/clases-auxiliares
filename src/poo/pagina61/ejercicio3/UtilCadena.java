package poo.pagina61.ejercicio3;

public class UtilCadena {

    public String ConvertirMayuscula(String texto) {

       String [] palabras = texto.split(" ");
       String resultado = "";

        for (String palabra : palabras){
            resultado += palabra.substring(0,1).toUpperCase()
                    + palabra.substring(1) + " ";

        }
        return resultado;
    }
}
