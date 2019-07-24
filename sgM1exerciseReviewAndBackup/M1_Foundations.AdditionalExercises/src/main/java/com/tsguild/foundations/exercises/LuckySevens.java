/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class LuckySevens {

    public static void main(String[] args) {
        int dollars = 0;
        int rolls = 0;
        int richestRollPoint = 0;
        int richestPoint = dollars;
        int dice1 = 0;
        int dice2 = 0;
//        Each round, the program rolls a virtual pair of dice for the user
//If the sum of the 2 dice is equal to 7, the player wins $4; otherwise, the player loses $1
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many dollars do you have? ");
        dollars = Integer.parseInt(sc.nextLine());
        if (dollars < 0) {
            System.out.println("Sorry, you have no money to play.");
            System.exit(0);
        } else {
            while (dollars > 0) {
                dice1 = rand.nextInt(6) + 1;
                dice2 = rand.nextInt(6) + 1;
                int diceSum = dice1 + dice2;
                if (diceSum == 7) {
                    dollars += 4;
                } else {
                    dollars -= 1;
                }
                rolls++;
                if (dollars > richestPoint) {
                    richestPoint = dollars;
                    richestRollPoint = rolls;
                }
            }
            System.out.println("You are broke after " + rolls + " rolls.");
            System.out.println("You should have quit after " + richestRollPoint + " when you had $" + richestPoint);
        }
    }
}
