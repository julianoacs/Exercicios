import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a Quantidade de dias trabalhados: ");
        int dias = teclado.nextInt();
        double salarioHoras = 8 * 25;
        double salario = dias * salarioHoras;
        System.out.println("O salário é: " + salario);

    }
}