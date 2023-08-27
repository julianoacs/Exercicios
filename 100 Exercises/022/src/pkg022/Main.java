/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg022;

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
        System.out.println("Enter the year of your birth:");
        int birth = keyboard.nextInt();
        int age = 2023 - birth;
        if (age <= 18) {
            int age2 = 18 - age;
            System.out.println("You are " + age + " Years old, and not eligible to enlist.");
            System.out.println("Years for military enlistment: " + age2);
        } else {
            System.out.println("You are " + age + " years old, and eligible to enlist.");
        }
    }
    
}
