/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg002;

//@author Juliano Silva

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Sccaner usado para captar o que foi digitado no teclado. Obs: Importar Scanner.
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Bem Vindo ---");
        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();
        // Sinal de ( + ) usado para concatenar um texto.
        System.out.println("Ola " + nome + ", e um prazer te conhecer!");
    }
    
}
