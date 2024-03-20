import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Jogo Adivinhacao");
        System.out.println("Digite um numero entre 1 e 5: ");
        int palpite = teclado.nextInt();
        int computador = (int) (Math.random()* 5 + 1);
        if (palpite == computador){
            System.out.println("Voce Acertou o numero");
        } else {
            System.out.println("Digite outro numero");
        }
    }
}