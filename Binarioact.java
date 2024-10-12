
package binarioact;

/**
 *
 * @author Pamela
 */

import java.util.Scanner;

public class Binarioact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o numero decimal: ");
        String decimal = leitor.nextLine();
        
        String binario = binarioact(decimal);
        System.out.println("O numero decimal para binario e: " +binario);
    }
    
    public static String binarioact(String decimalStr){
    
    int decimal = Integer.parseInt(decimalStr);
   
    
   
  return Integer.toBinaryString(decimal);
}


}