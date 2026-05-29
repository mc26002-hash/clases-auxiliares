package poo.pagina61.ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONTAR VOCAL A ===");

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        UtilCadena util = new UtilCadena();

        int cantidad = util.contarVocalA(frase);

        System.out.println("La vocal A aparece " + cantidad + " veces.");

        scanner.close();
    }
}