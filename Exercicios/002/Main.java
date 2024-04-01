import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Bem Vindo ---");
        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Ola " + nome + ", e um prazer te conhecer!");
    }
}
