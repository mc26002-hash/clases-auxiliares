package poo.pagina61.ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ELIMINAR ÚLTIMA PALABRA ===");

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        UtilCadena util = new UtilCadena();

        String resultado = util.eliminarUltimaPalabra(frase);

        System.out.println("Frase resultante: " + resultado);

        scanner.close();
    }
}