import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.

public class Main {
    public static void main(String[] args) {
        
        // Objeto que será usado para ler entrada do usuário.
        Scanner teclado = new Scanner(System.in);

        // Solicita um numero ao usuário e armazena na variável numero1.
        System.out.print("Digite o primeiro valor: ");
        double numero1 = teclado.nextDouble();

        // Solicita um numero ao usuário e armazena na variável numero2.
        System.out.print("Digite o segundo valor: ");
        double numero2 = teclado.nextDouble();

        // Calcula a soma dos dois números e armazena o resultado na variável resultado.
        double resultado = numero1 + numero2;

        // Exibe o resultado da soma.
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " e igual a " + resultado); 

        // Fecha o Scanner para liberar recursos
        teclado.close();
    }
}
