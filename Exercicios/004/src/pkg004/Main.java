/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg004;

// @author Juliano Silva

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Scanner para captar o que sera digitado no teclado.
        Scanner teclado = new Scanner(System.in);
         // Logica para digitar os numeros a serem somados.
        System.out.print("Digite o primeiro valor: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2 = teclado.nextInt();
        //Logica para soma dos numeros
        int resultado = num1 + num2;
        // Logica para imprimir o resultado no terminal.
        System.out.println("A soma entre " + num1 + " e " + num2 + " e igual a " + resultado);
        
    }

}
