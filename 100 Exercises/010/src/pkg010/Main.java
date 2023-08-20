/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg010;

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
        System.out.println("Enter the width of the wall: ");
        float heigth1 = keyboard.nextFloat();
        System.out.println("Enter wall heigth: ");
        float width1 = keyboard.nextFloat();
        float sqme = heigth1 * width1;
        float paint = sqme / 2;
        System.out.println("The wall is " + sqme + " square meters.");
        System.out.println("You will need " + paint + " liters of paint.");
    } 
}
