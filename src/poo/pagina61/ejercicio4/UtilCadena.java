package poo.pagina61.ejercicio4;

public class UtilCadena {

    public String eliminarUltimaPalabra(String frase) {

        frase = frase.trim();

        int ultimaPosicion = frase.lastIndexOf(" ");

        if (ultimaPosicion == -1) {

            return "";
        }

        return frase.substring(0, ultimaPosicion);
    }
}