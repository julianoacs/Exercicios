import java.time.LocalDate; // Importa a classe LocalDate para trabalhar com datas.
import java.time.format.DateTimeFormatter; // Importa a classe DateTimeFormatter para formatar datas.
import java.util.Scanner; // Import da classe Scanner, usado para ler entradas do usuário a partir do teclado ou de outras fontes de entrada.

public class Main {
    public static void main(String[] args) {
        
        // Objeto que será usado para ler entrada do usuário.
        Scanner teclado = new Scanner(System.in);

        // Solicita o nome do usuário e armazena na variável nome.
        System.out.print("Digite seu Nome: ");
        String nome = teclado.nextLine();

        // Solicita o salário do usuário e armazena na variável salário.
        System.out.print("Salario R$ ");
        double salario = teclado.nextDouble();
        
        // Obtém a data atual e formata a data atual para exibir o nome do mês.
        LocalDate dataAtual = LocalDate.now();
        String mesAtual = dataAtual.format(DateTimeFormatter.ofPattern("MMMM"));

        // Exibe o nome do usuário, o salário e o mês atual.
        System.out.println("O funcionario " + nome + " tem um salário de R$ " + salario + " em " + mesAtual);
    }
}
