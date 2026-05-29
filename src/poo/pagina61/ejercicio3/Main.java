package poo.pagina61.ejercicio3;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar texto:");

        String texto = sc.nextLine();

        UtilCadena util = new UtilCadena();
        String resultado = util.ConvertirMayuscula(texto);

        System.out.println(resultado);

    }

}
