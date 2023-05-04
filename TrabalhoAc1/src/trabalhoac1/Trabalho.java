package trabalhoac1;

import java.util.Scanner;
import java.util.Random;

public class Trabalho {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random gerador = new Random();

        int aleatorio = gerador.nextInt(101);

        int palpuser = -1;
        int tentativas;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando entre 0 e 100.");

        for (tentativas = 10; palpuser != aleatorio && tentativas > 0; tentativas--) {

            System.out.println("Tentativas restantes: " + tentativas);
            System.out.printf("Digite um número: ");
            palpuser = scan.nextInt();

            if (tentativas > 1) {
                if (palpuser < aleatorio) {
                    System.out.println("\nTente um número maior!");
                } else if (palpuser > aleatorio) {
                    System.out.println("\nTente um número menor!");
                }
            }
        }
        if (palpuser == aleatorio) {
            System.out.println("\nParabéns, você acertou!");
            System.out.println("Você precisou de " + (10 - tentativas) + " tentavivas para descobrir!");
        } else {
            System.out.println("\nInfelizmente, você perdeu!");
        }

        System.out.println("O número que eu estava pensando era o " + aleatorio + ".");

    }
}
