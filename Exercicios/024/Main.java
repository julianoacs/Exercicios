import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem Vindo !");
        System.out.print("Digite a distancia a ser percorrida: ");
        int distancia = teclado.nextInt();
        if (distancia <= 200) {
            System.out.println("O valor da passagem é R$ " + distancia * 0.5);
        } else {
            System.out.println("O valor da passagem é R$ " + distancia * 0.45);
        }
    }
}