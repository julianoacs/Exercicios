import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do seu salario: R$ ");
        double salario = teclado.nextDouble();
        double novoSalario = salario + (salario * 0.15);
        System.out.println("Seu salario com 15% de aumento é: R$ " + String.format("%.2f", novoSalario));
        teclado.close();
    }
}