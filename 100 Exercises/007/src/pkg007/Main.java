/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg007;

import java.text.DecimalFormat;
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
        DecimalFormat exit = new DecimalFormat(); 
        System.out.println("Type a number: ");
        double number = keyboard.nextDouble();
        double num1 = number + number;
        double num2 = number / 3;
        System.out.println("The double to " + number + " is " + num1);
        System.out.println("The thirt part of " + number + " is " + num2);
    }
    
}
