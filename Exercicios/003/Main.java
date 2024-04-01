import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Salario R$ ");
        double salario = teclado.nextDouble();

        LocalDate dataAtual = LocalDate.now();
        String mesAtual = dataAtual.format(DateTimeFormatter.ofPattern("MMMM"));

        System.out.println("O funcionario " + nome + " tem um salrio de R$ " + salario + " em " + mesAtual);
    }
}
