/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg017;

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
        System.out.println("Enter your car's speed");
        int speed = keyboard.nextInt();
        if (speed >= 80){
            int speed2 = (speed - 80) * 5;
            System.out.println("You've been fined US$" + speed2 + " Dollars");
        } else {
            System.out.println("You are within the speed limit");
        }
    }
    
}
