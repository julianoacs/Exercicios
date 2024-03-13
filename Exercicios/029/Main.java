import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Progrma para calcular ajuste de Salario.");
        System.out.println("Digite seu Nome: ");
        String nome = teclado.nextLine();
        System.out.println("Qual seu salario: R$ ");
        double salario = teclado.nextDouble();
        System.out.println("Quantos anos voce trabalha na empresa: ");
        int anosDeEmpresa = teclado.nextInt();
        if (anosDeEmpresa < 3) {
            double novoSalario3 = (salario * 3) / 100 + salario;
            System.out.println("Obrigado por seus anos de Servico " + nome);
            System.out.println("Voce ganhou um aumento, seu novo Salario e R$ " + novoSalario3);
        } else if ((anosDeEmpresa >= 3) && (anosDeEmpresa <= 10)){
            double novoSalario12 = (salario * 12.5) / 100 + salario;
            System.out.println("Obrigado por seus anos de Servico " + nome);
            System.out.println("Voce ganhou um aumento, seu novo Salario e R$ " + novoSalario12);
        } else {
            double novoSalario20 = (salario * 20) / 100 + salario;
            System.out.println("Obrigado por seus anos de Servico " + nome);
            System.out.println("Voce ganhou um aumento, seu novo Salario e R$ " + novoSalario20);
        }
    }
}