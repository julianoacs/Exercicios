import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = teclado.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);
            System.out.println("Situação: Reprovado");
        }
    }
}