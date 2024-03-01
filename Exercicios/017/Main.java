import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite sua velocidade: ");
        int velocidade = teclado.nextInt();
        if (velocidade > 80) {
            int limite = velocidade - 80;
            double multa = limite * 5;
            System.out.println("Você foi multado!");
            System.out.println("O valor da multa é: " + multa);
        } else {
            System.out.println("Você está dentro do limite de velocidade!");
        }
    }
}