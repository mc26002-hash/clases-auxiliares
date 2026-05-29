package poo.pagina61.ejercicio6;

public class UtilCadena {

    public boolean esPalindromo(String palabra) {

        palabra = palabra.toLowerCase();

        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {

            invertida += palabra.charAt(i);
        }

        return palabra.equals(invertida);
    }
}