/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg016;

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
        System.out.print("Enter the value of A: ");
        double a = keyboard.nextDouble();
        System.out.print("Enter the value of B: ");
        double b = keyboard.nextDouble();
        System.out.print("Enter the value of C: ");
        double c = keyboard.nextDouble();
        double delta = b * b - 4 * a * c;
        System.out.println("Delta is: " + delta);
    }
    
}
