
package javaex3;

/**
 *
 * @author Pamela
 */
import java.util.Scanner; 

public class JavaEX3 {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.println("Ola informe o seu salario base: " );
       double salbase = leitor.nextDouble();
       System.out.println("Ola informe a sua grstificaçao: ");
       double grafit = leitor.nextDouble();
       
       double salbruto = salbase + grafit;
       
       double ir;
       if (salbruto < 1000) {
           ir = salbruto * 0.20;
       } else {
           ir = salbruto * 0.15;
       }
       
       double salliq = salbruto - ir;
       
       System.out.println("O salario liquido e: "+salliq);
    }
    
}
