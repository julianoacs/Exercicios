import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Locadora de veiculos.");
        System.out.println("Escolha o modelo do Veiculo");
        System.out.println("1 - Popular");
        System.out.println("2 - Luxo");
        System.out.print("Opção escolhida: ");
        int veiculoEscolhido = teclado.nextInt();
        System.out.print("Numero de diarias: ");
        int numeroDeDiarias = teclado.nextInt();
        System.out.print("Quilômetros percorridos: ");
        double kmPercorrido = teclado.nextDouble();

        if ((veiculoEscolhido == 1) && (kmPercorrido <=100)){
            int valorDiaria = numeroDeDiarias * 90;
            double valorKmPercorrido = kmPercorrido * 0.20;
            double valorAluguel = valorKmPercorrido + valorDiaria;
            System.out.println("Veiculo Escolhido: Popular");
            System.out.println("Diarias: " + numeroDeDiarias);
            System.out.println("Quilômetros percorridos: " + kmPercorrido);
            System.out.println("Valor a ser Pago: R$ " + valorAluguel );
        } else if ((veiculoEscolhido == 1) && (kmPercorrido >100)){
            int valorDiaria = numeroDeDiarias * 90;
            double valorKmPercorrido = kmPercorrido * 0.10;
            double valorAluguel = valorKmPercorrido + valorDiaria;
            System.out.println("Veiculo Escolhido: Popular");
            System.out.println("Diarias: " + numeroDeDiarias);
            System.out.println("Quilômetros percorridos: " + kmPercorrido);
            System.out.println("Valor a ser Pago: R$ " + valorAluguel );
        } else if ((veiculoEscolhido == 2) && (kmPercorrido <=200)){
            int valorDiaria = numeroDeDiarias * 150;
            double valorKmPercorrido = kmPercorrido * 0.30;
            double valorAluguel = valorKmPercorrido + valorDiaria;
            System.out.println("Veiculo Escolhido: Luxo");
            System.out.println("Diarias: " + numeroDeDiarias);
            System.out.println("Quilômetros percorridos: " + kmPercorrido);
            System.out.println("Valor a ser Pago: R$ " + valorAluguel );
        } else {
            int valorDiaria = numeroDeDiarias * 150;
            double valorKmPercorrido = kmPercorrido * 0.25;
            double valorAluguel = valorKmPercorrido + valorDiaria;
            System.out.println("Veiculo Escolhido: Luxo");
            System.out.println("Diarias: " + numeroDeDiarias);
            System.out.println("Quilômetros percorridos: " + kmPercorrido);
            System.out.println("Valor a ser Pago: R$ " + valorAluguel);
        }
    }
}



