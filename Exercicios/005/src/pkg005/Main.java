/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg005;

//@author Juliano Silva
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Scanner para captar o que sera digitado no teclado.
        Scanner teclado = new Scanner(System.in);
        // Logica para obeter as notas do aluno.
        System.out.print("Aluno: ");
        String aluno = teclado.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = teclado.nextDouble();
        /*
         *Logica para obter media do aluno 
         *Operacoes no java devem seguir ordem de precedencia
         *operacoes dentro de parenteses sao feitas antes de qualquer outra operacao.
         */
        double media = (nota1 + nota2) / 2;
        // Logica para imprimir resultado no terminal.
        System.out.println("Media do Aluno(a)");
        System.out.println("Aluno: " + aluno);
        System.out.println("Media: " + media);

    }

}
