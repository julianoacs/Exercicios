import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = teclado.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O Sucessor de " + numero + " e " + sucessor);
        System.out.println("O Antecessor de " + numero + " e " + antecessor);
    }
}