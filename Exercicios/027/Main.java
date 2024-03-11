import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de Média");
        System.out.println("Digite seu Nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();
        double media = (nota1 + nota2)/2;
        if (media <= 4.9) {
            System.out.println("Aluno: " + nome);
            System.out.println("Media: " + media);
            System.out.println("Status: REPROVADO");
        } else if ((media >= 5) && (media <= 6.9)){
            System.out.println("Aluno: " + nome);
            System.out.println("Media: " + media);
            System.out.println("Status: RECUPERAÇÃO");
        } else {
            System.out.println("Aluno: " + nome);
            System.out.println("Media: " + media);
            System.out.println("Status: APROVADO");
        }
     }
}