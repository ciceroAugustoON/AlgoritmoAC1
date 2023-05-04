package trabalhoac1;
import java.util.Scanner;
import java.util.Random;
public class Trabalho {
    
    public static void main(String[] args) {
        
        //Setando o Scanner.
        Scanner scan = new Scanner(System.in);
        //Setando o random que vai ser responsável por gerar o número que precisamos advinhar.
        Random gerador = new Random();
        //Parte que insere o número aleatorio na variavel.
        int random1 = gerador.nextInt(101);
        
        //Variável de palpite do usuario.
        int palpuser = -1;
        int tentativas;
        //Println para informação do usuário de como jogar.
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando entre 0 e 100.");
        
        //Laço de repetição while para que o jogo permaneça até o usuário acertar o número.
        for (tentativas = 10; palpuser != random1; tentativas--) {
            //Entrada de usuário com palpite.
            System.out.println("Tentativas restantes: "+tentativas);
            System.out.printf("Digite um número: "); palpuser = scan.nextInt();
            
            //If e else que dão dicas ao usuário se o número aleatório gerado é maior ou menor.
            if (palpuser < random1) {
                System.out.println("Tente um n�mero maior!");
            } else if (palpuser > random1) {
                System.out.println("Tente um n�mero menor!");
            }
        }

        //Saída de informações que mostra a quantidade de tentativas que o usuario precisou para chegar ao número e revela o número que foi pensado.
        System.out.println("Parabéns, você acertou!");
        System.out.println("O número que eu estava pensando era o " + random1 + ".");
        System.out.println("Você precisou de " + (10-tentativas) + " tentavivas para descobrir!"); 

    }
}