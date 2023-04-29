/*

 */
package eva3_5_captura;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EVA3_5_CAPTURA {


    public static void main(String[] args) {  
  int x;
  
  do {
    try{
    Scanner input = new Scanner (System.in);      
       System.out.println("Introduzca el valor (entero) de x:");
        x = input.nextInt();
        break;
    } catch(InputMismatchException e){
      System.out.println("No se introdujo un número válido. Vuelva a capturar.");         
    }
 } while(true);  
  System.out.println("Valor de x: "+x);
  System.out.println("Fin del programa.");
  }
    
}
