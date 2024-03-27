import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vida saudável: ganhe dinheiro por hora de atividade física");
        System.out.println("Digite as horas de atividade no mês: ");
        int horasDeAtividade = teclado.nextInt();
        if (horasDeAtividade <= 10){
            int pontos = horasDeAtividade * 2;
            double valorGanho = pontos * 0.05;
            System.out.println("Horas de Atividade: " + horasDeAtividade);
            System.out.println("Pontos acumulados: " + pontos);
            System.out.println("Valor a Resgatar R$ " + valorGanho);
        } else if ((horasDeAtividade > 10 ) && (horasDeAtividade <= 20)) {
            int pontos = horasDeAtividade * 5;
            double valorGanho = pontos * 0.05;
            System.out.println("Horas de Atividade: " + horasDeAtividade);
            System.out.println("Pontos acumulados: " + pontos);
            System.out.println("Valor a Resgatar R$ " + valorGanho);
        } else {
            int pontos = horasDeAtividade * 10;
            double valorGanho = pontos * 0.05;
            System.out.println("Horas de Atividade: " + horasDeAtividade);
            System.out.println("Pontos acumulados: " + pontos);
            System.out.println("Valor a Resgatar R$ " + valorGanho);
        }
    }
}