package poo.pagina61.ejercicio2;

import java.util. Scanner;
       public class Main {

      public static void main(String[] args){

          Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese Texto");

          String texto = sc.nextLine();

          UtilCadena util = new UtilCadena();
          String resultado = util.QuitarEspacios(texto);
          
          System.out.println("Resultado:"+ resultado);


      }
       }