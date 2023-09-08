/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg029;

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
        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter your salary: ");
        double salary = keyboard.nextDouble();
        System.out.println("Years in the company: ");
        int years = keyboard.nextInt();
        if (years >= 10) {
            double newsalary = (salary*20)/100+salary;
            System.out.println("Congratulations " + name + " Your new salary is: US$ " + newsalary);
        } else if ((years > 3) && (years < 10)) {
            double newsalary2 = (salary*12.5)/100+salary;
            System.out.println("Congratulations " + name + " Your new salary is: US$ " + newsalary2);
        } else if (years < 3) {
            double newsalary3 = (salary*3)/100+salary;
            System.out.println("Congratulations " + name + " Your new salary is: US$ " + newsalary3);
        }
    }
    
}
