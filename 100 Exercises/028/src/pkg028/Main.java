/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg028;

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
        System.out.print("Enter the width: ");
        double number1 = keyboard.nextDouble();
        System.out.print("Enter the length: ");
        double number2 = keyboard.nextDouble();
        double sm = (number1 + number2)/2;
        if (sm >= 500) {
            System.out.println("Square meters: " + sm);
            System.out.println("Vip Land.");
        } else if (( sm >= 100 ) && ( sm <= 499 )) {
            System.out.println("Square meters: " + sm);
            System.out.println("Master Land.");
        } else {
            System.out.println("Square meters: " + sm);
            System.out.println("Popular Land.");
        }
    }
    
}
