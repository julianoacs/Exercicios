/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg012;

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
        System.out.println("Enter the employee's name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter the employee's salary: ");
        float salary = keyboard.nextFloat();
        float salary1 = (salary * 15)/100;
        float salary2 = salary + salary1;
        System.out.println("Employee: " + name);
        System.out.println("New Salary: " + salary2);
    }
    
}
