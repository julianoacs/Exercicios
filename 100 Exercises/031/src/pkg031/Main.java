/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg031;

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
        Scanner keyboard = new Scanner(System.in);
        System.out.println("---- JoKenPo ----");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.print("Enter your option:");
        int player = keyboard.nextInt();
        switch (player) {
            case 1:
                System.out.println("Player chose ROCK.");
                break;
            case 2:
                System.out.println("Player chose PAPER.");
                break;
            case 3:
                System.out.println("Player chose SCISSORS.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        int computer = 0;
        computer = (int) (Math.random() * 3 + 1);
        switch (computer) {
            case 1:
                System.out.println("Computer chose ROCK.");
                break;
            case 2:
                System.out.println("Computer chose PAPER.");
                break;
            case 3:
                System.out.println("Computer chose SCISSORS.");
                break;
        }
        if (player == computer) {
            System.out.println("DRAW");
        } else if ((player == 1 && computer == 3) || (player == 2 & computer == 1) || (player == 3 && computer == 2)) {
            System.out.println("Player WINS");
        } else {
            System.out.println("Computer WINS");
        }
    }

}
