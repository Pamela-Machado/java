
package javaex4;

/**
 *
 * @author Pamela
 */
public class Javaex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Número de quadrados no tabuleiro de xadrez
        int totalSquares = 64;

        // Variável para armazenar o total de grãos
        long totalGrains = 0;

        // Variável para armazenar o número de grãos em cada quadrado (inicialmente 1 grão)
        long grainsInCurrentSquare = 1;

        // Calcula o número total de grãos
        for (int i = 0; i < totalSquares; i++) {
            totalGrains += grainsInCurrentSquare;
            grainsInCurrentSquare *= 2; // Dobrar o número de grãos para o próximo quadrado
        }

        // Exibe o resultado
        System.out.println("Número total de graos: " + totalGrains);
    }
    }
    

