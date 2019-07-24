/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();
        Scanner sc = new Scanner(System.in);

        int sides;
        int rollResult;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");

        System.out.print("Enter number of sides for your dice (# greather than 1): ");
        sides = Integer.parseInt(sc.nextLine());
        rollResult = diceRoller.nextInt(sides) + 1;
        System.out.println("You rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch.");
        } else if (rollResult == sides) {
            System.out.println("You rolled a critical! Nice job!");
        }
    }

}
