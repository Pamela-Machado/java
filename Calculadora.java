/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Pamela
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

        
    // Métodos para soma
    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    // Métodos para subtração
    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    // Métodos para multiplicação
    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // Métodos para divisão
    public int divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return num1 / num2;
    }

    public double divisao(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 – Somar");
            System.out.println("2 – Subtrair");
            System.out.println("3 – Multiplicar");
            System.out.println("4 – Dividir");
            System.out.println("5 – Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = 0;
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Por favor, insira um número.");
                scanner.next(); // Limpa o buffer do scanner
                continue;
            }
            
            if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }
            
            double num1 = 0;
            double num2 = 0;
            try {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira números válidos.");
                scanner.next(); // Limpa o buffer do scanner
                continue;
            }
            
            switch (opcao) {
                case 1: // Somar
                    if (isInteger(num1) && isInteger(num2)) {
                        int resultadoInt = calculadora.soma((int) num1, (int) num2);
                        System.out.println("Resultado: " + resultadoInt);
                    } else {
                        double resultadoDouble = calculadora.soma(num1, num2);
                        System.out.println("Resultado: " + resultadoDouble);
                    }
                    break;
                case 2: // Subtrair
                    if (isInteger(num1) && isInteger(num2)) {
                        int resultadoInt = calculadora.subtracao((int) num1, (int) num2);
                        System.out.println("Resultado: " + resultadoInt);
                    } else {
                        double resultadoDouble = calculadora.subtracao(num1, num2);
                        System.out.println("Resultado: " + resultadoDouble);
                    }
                    break;
                case 3: // Multiplicar
                    if (isInteger(num1) && isInteger(num2)) {
                        int resultadoInt = calculadora.multiplicacao((int) num1, (int) num2);
                        System.out.println("Resultado: " + resultadoInt);
                    } else {
                        double resultadoDouble = calculadora.multiplicacao(num1, num2);
                        System.out.println("Resultado: " + resultadoDouble);
                    }
                    break;
                case 4: // Dividir
                    try {
                        if (isInteger(num1) && isInteger(num2)) {
                            int resultadoInt = calculadora.divisao((int) num1, (int) num2);
                            System.out.println("Resultado: " + resultadoInt);
                        } else {
                            double resultadoDouble = calculadora.divisao(num1, num2);
                            System.out.println("Resultado: " + resultadoDouble);
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 5.");
            }
        }
        scanner.close();
    }
    
    private static boolean isInteger(double value) {
        return value == (int) value;
    }


    
    
}
