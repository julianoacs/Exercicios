/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg026;

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
        System.out.print("Enter one number: ");
        int number1 = keyboard.nextInt();
        System.out.print("Enter other number: ");
        int number2 = keyboard.nextInt();
        if (number1 == number2) {
            System.out.println("The numbers are the same.");
        } else if (number1 > number2) {
            System.out.println("The number " + number1 + " is bigger.");
        } else {
            System.out.println("The number " + number2 + " is bigger.");
        }
    }
    
}
