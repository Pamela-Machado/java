/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer2ifelse;

/**
 *
 * @author Pamela
 */

import java.util.Scanner;
public class Exer2ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        a = leitor.nextInt();
        
        //para o usuario digitar o numero desejado retireo o int a= 10 e
        //no lugar de int numero coloque int a
        if(a >= 0){
            
        resultado = a * 2;
        
        System.out.println(" O dobro de " +a+ " e " +resultado);
        
        } else  {
            System.out.println("Numero invalido, o numero deve serpositivo");
        }
        
       
    }
    
}
