import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Alistamento Militar");
        System.out.print("Digite seu Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        int idade = 2024 - anoNascimento;
        if (idade >= 18) {
            int anosAtraso = idade - 18;
            System.out.println("Você já pode se alistar");
            System.out.println("Você está atrasado " + anosAtraso + " anos");
        } else {
            int anosFalta = 18 - idade;
            System.out.println("Você ainda não pode se alistar");
            System.out.println("Falta " + anosFalta + " anos para você se alistar");
        }
    }
}