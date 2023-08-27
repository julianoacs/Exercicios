/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg025;

import java.util.Scanner;

/**
 *
 * @author Juliano Silva
 */

public class Main {
     public static boolean triangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the length of the first side: ");
        double sideA = keyboard.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double sideB = keyboard.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double sideC = keyboard.nextDouble();
        if (triangle(sideA, sideB, sideC)) {
            System.out.println("Is it possible to form a tringle.");
        } else {
            System.out.println("It is not possible to form a tringle.");
        }
    }
    
}
