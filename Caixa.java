/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pamela
 */
import java.util.Scanner;

public class Caixa {
    private static float saldo = 1000;  // Saldo inicial de R$ 1000,00

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cpf = "12345678900";
        String senha = "01020304";
        
        // Tela de boas-vindas
        System.out.println("Bem-vindo ao Caixa Eletrônico!");
        System.out.print("Digite o CPF: ");
        String inputCpf = scanner.nextLine();

        System.out.print("Digite a Senha: ");
        String inputSenha = scanner.nextLine();

        // Verificação do CPF e Senha
        if (inputCpf.equals(cpf) && inputSenha.equals(senha)) {
            int opcao;
            do {
                // Exibição do Menu
                System.out.println("\nMenu:");
                System.out.println("1 - Ver Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        mostrarSaldo();
                        break;
                    case 2:
                        System.out.print("Digite o valor para depósito: ");
                        float deposito = scanner.nextFloat();
                        efetuarDeposito(deposito);
                        break;
                    case 3:
                        System.out.print("Digite o valor para saque: ");
                        float saque = scanner.nextFloat();
                        efetuarSaque(saque);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
        } else {
            System.out.println("CPF ou Senha inválidos!");
        }

        scanner.close();
    }

    // Método para mostrar o saldo
    private static void mostrarSaldo() {
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }

    // Método para efetuar depósito
    private static void efetuarDeposito(float valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        mostrarSaldo();
    }

    // Método para efetuar saque
    private static void efetuarSaque(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        mostrarSaldo();
    }
}
