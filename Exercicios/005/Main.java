import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Aluno: ");
        String aluno = teclado.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = teclado.nextDouble();
    
        double mediaNotas = (nota1 + nota2) / 2;

        System.out.println("Media do Aluno(a)");
        System.out.println("Aluno: " + aluno);
        System.out.println("Media: " + mediaNotas );
    }
}
