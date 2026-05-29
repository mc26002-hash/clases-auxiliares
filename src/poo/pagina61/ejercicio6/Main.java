package poo.pagina61.ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PALÍNDROMO ===");

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        UtilCadena util = new UtilCadena();

        boolean resultado = util.esPalindromo(palabra);

        if (resultado) {

            System.out.println("La palabra es palíndroma.");

        } else {

            System.out.println("La palabra no es palíndroma.");
        }

        scanner.close();
    }
}