/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg004;

import java.util.Scanner;

/**
 *
 * @author Juliano Silva
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Type one number: ");
        int number1 = keyboard.nextInt();
        System.out.println("Type other number: ");
        int number2 = keyboard.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of the values is " +sum);
    }
    
}
