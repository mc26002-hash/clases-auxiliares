package poo.pagina61.ejercicio1;

import java.util.Scanner;

public class Main{

    public static void main (String[] args) {

   Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese una Frase:");

    String frase = sc.nextLine();
    UtilCadena util = new UtilCadena();

    int cantidad = util.contarpalabras(frase);

    System.out.println("Cantidad de palabras"+ cantidad );


    }
}
