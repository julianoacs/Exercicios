/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg030;

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
        System.out.print("Enter the length of the first side: ");
        double sideA = keyboard.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double sideB = keyboard.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double sideC = keyboard.nextDouble();
        if ((sideA + sideB > sideC) && (sideA + sideB > sideC) && (sideB + sideC > sideA)) {
            if (sideA == sideB && sideB == sideC) {
                System.out.println("Is it possible to form an equilateral triangle (all sides equal).");
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                System.out.println("It is possible to form an isosceles triangle (two equal sides).");
            } else {
                System.out.println("Is it possible to form a scalene triangle(all different sides).");
            }
        } else {
            System.out.println("It is not possible to form a triangle with these lengths.");
        }
    }
    
}
