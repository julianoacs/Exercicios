import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de aumento de salario.");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Genero: (M) Mulher / (H) Homen: ");
        String genero = teclado.nextLine();
        System.out.print("Salario atual: R$ ");
        double salario = teclado.nextDouble();
        System.out.print("Anos de empresa: ");
        int anosNaEmpresa = teclado.nextInt();

        double novoSalario = 0;

        if (genero.equalsIgnoreCase("M")){
            if (anosNaEmpresa < 15){
                novoSalario = salario * 0.05 + salario;
            } else {
                if (anosNaEmpresa <=20){
                    novoSalario = salario * 0.12 + salario;
                } else {
                    novoSalario = salario * 0.23 + salario;
                }
            }
        } else {
            if (anosNaEmpresa < 20){
                novoSalario = salario * 0.03 + salario;
            } else {
                if (anosNaEmpresa <=30){
                    novoSalario = salario * 0.13 + salario;
                } else {
                    novoSalario = salario * 0.25 + salario;
                }
            }
        }
        System.out.println("***********************************");
        System.out.println("Funcionario: " + nome);
        System.out.println("Novo Salario: R$ " + novoSalario);
        System.out.println("***********************************");
    }
}
