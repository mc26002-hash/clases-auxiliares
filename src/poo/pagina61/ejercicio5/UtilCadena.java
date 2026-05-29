package poo.pagina61.ejercicio5;

public class UtilCadena {

    public int contarVocalA(String frase) {

        int contador = 0;

        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'A') {

                contador++;
            }
        }

        return contador;
    }
}