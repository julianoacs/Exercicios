/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg003;

// @author Juliano Silva
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Scanner para captar o que digitado no teclado.
        Scanner teclado = new Scanner(System.in);
        // Logica para digitar o Nome e Salario
        System.out.print("Digite seu Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Salario R$ ");
        double salario = teclado.nextDouble();

        // Logica para captar e formatar o mes atual do sistema
        LocalDate dataAtual = LocalDate.now();
        String mesAtual = dataAtual.format(DateTimeFormatter.ofPattern("MMMM"));

        System.out.println("O funcionario " + nome + " tem um salrio de R$ " + salario + " em " + mesAtual);

    }

}
