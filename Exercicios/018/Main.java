import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        int idade = 2024 - anoNascimento;
        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos.");
            System.out.println("Você esta apto a votar");
        } else {
            System.out.println("Você tem " + idade + " anos.");
            System.out.println("Você nao pode votar.");
        }
    }
}