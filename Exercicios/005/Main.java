import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.

public class Main {
    public static void main(String[] args) {

        // Objeto que será usado para ler entrada do usuário.
        Scanner teclado = new Scanner(System.in);

        // Solicita e lê o nome do aluno.
        System.out.print("Aluno: ");
        String aluno = teclado.nextLine();

         // Solicita e lê a primeira nota do aluno.
        System.out.print("Nota 1: ");
        double nota1 = teclado.nextDouble();

         // Solicita e lê a segunda nota do aluno.
        System.out.print("Nota 2: ");
        double nota2 = teclado.nextDouble();

        // Calcula a média das duas notas.
        double mediaNotas = (nota1 + nota2) / 2;
        
        // Exibe a média do aluno.
        System.out.println("Media do Aluno(a)");
        System.out.println("Aluno: " + aluno);
        System.out.println("Media: " + mediaNotas);
        
        // Fecha o Scanner para liberar recursos
        teclado.close();
    }
}
