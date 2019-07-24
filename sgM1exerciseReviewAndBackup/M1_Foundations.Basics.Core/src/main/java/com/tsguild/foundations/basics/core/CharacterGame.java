/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.basics.core;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class CharacterGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String characterName = "Player 1";
        Random randomizer = new Random();

        int characterHealth = randomizer.nextInt(100);
        int age = 0;
        String stringAge = "";
        boolean playGame = randomizer.nextBoolean();
        int numOfSteps = 0;
        System.out.println("What is your character's age: ");
        age = Integer.parseInt(stringAge);

        do {
            System.out.println("What is your name?");
            characterName = sc.nextLine();
        } while ("Player 1".equals(characterName));

        while (characterHealth > 0) {
            System.out.println("You have entered a new floor");
            //i = i +1;
            for (int steps = 0; steps < 10; steps++) {

                System.out.println("You have taken another step");
                numOfSteps += 1;
                boolean isEncounter = randomizer.nextBoolean();

                if (isEncounter) {
                    System.out.println("You have encountered a goblin");
                    int min = 0;
                    int max = 3;
                    min += (numOfSteps / 10) * 2;
                    max += (numOfSteps / 10) * 2;
                    int dmg = randomizer.nextInt((max - min) + 1) + min;
                    characterHealth -= dmg;
                    if (dmg > 0) {
                        System.out.println("You've taken damage (" + dmg + "), "
                                + "you are now at " + characterHealth);
                    } else {
                        System.out.println("You escaped with no damage!");
                    }
                    System.out.println("You see nothing");
                }
                if (characterHealth <= 0) {
                    break;
                }
            }
        }

        if ("Player 1".equals(characterName) && characterHealth >= 10
                || characterHealth == 10) {
            System.out.println("What is your character's name?");
            characterName = sc.nextLine();
        } else {
            System.out.println("Hello " + characterName);
            System.out.println("Your health is " + characterHealth);
        }
        System.out.println("You have died, you have made: " + numOfSteps / 10 + " floors.");
    }

}
