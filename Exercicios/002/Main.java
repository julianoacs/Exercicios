import java.util.Scanner; // Import da classe Scanner, usado para ler entradas do usuário a partir do teclado ou de outras fontes de entrada.

public class Main {
    public static void main(String[] args) {
        
        // Objeto que será usado para ler entrada do usuário.
        Scanner teclado = new Scanner(System.in);
        
        // Método para imprimir a mensagem fornecida, solicitando ao usuário que digite seu nome.
        System.out.println("Digite seu nome:");
        
        // Método do objeto para ler a linha de entrada do usuário e armazenar na variável 'nome'
        String nome = teclado.nextLine();
        
        // Método para imprimir a mensagem fornecida, concatenada com o nome inserido pelo usuário
        System.out.println("Ola, seja muito bem vindo " + nome + ", é um prazer te conhecer!");

        // Fechamento do objeto 'scanner'
        teclado.close();
    }
}
