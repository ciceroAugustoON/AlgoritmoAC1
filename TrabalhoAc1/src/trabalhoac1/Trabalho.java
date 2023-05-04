package trabalhoac1;

import java.util.Scanner;
import java.util.Random;

public class Trabalho {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random gerador = new Random();

        int random1 = gerador.nextInt(101);

        int palpuser = -1;
        int tentativas;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando entre 0 e 100.");

        for (tentativas = 10; palpuser != random1; tentativas--) {

            System.out.println("Tentativas restantes: " + tentativas);
            System.out.printf("Digite um número: ");
            palpuser = scan.nextInt();

            if (palpuser < random1) {
                System.out.println("Tente um número maior!");
            } else if (palpuser > random1) {
                System.out.println("Tente um número menor!");
            }
        }

        System.out.println("ParabÃ©ns, você acertou!");
        System.out.println("O número que eu estava pensando era o " + random1 + ".");
        System.out.println("Você precisou de " + (10 - tentativas) + " tentavivas para descobrir!");

    }
}
