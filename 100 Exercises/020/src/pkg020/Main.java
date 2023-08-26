/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg020;

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
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        int result = number % 2;
        if (result == 0){
            System.out.println("The number is Evens");
        } else {
            System.out.println("The number is Odd");
        }
    }
}
