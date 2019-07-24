/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class AllTheTrivia {

    public static void main(String[] args) {
        String answer1, answer2, answer3, answer4;
        Scanner userInput = new Scanner(System.in);
        System.out.print("1,024 Gigabytes is equal to one what? ");
        answer1 = userInput.nextLine();
        System.out.print("In our solar system which is the only planet that rotates clockwise? ");
        answer2 = userInput.nextLine();
        System.out.print("The largest volcano ever discovered in our solar system is located on which planet? ");
        answer3 = userInput.nextLine();
        System.out.print("What is the most abundant element in the earth's atmosphere? ");
        answer4 = userInput.nextLine();

        System.out.println("Wow, 1,024 Gigabytes is a " + answer3 + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + answer1 + "!");
        System.out.println("That's amazing that " + answer2 + " is the most abundant element in the atmosphere...");
        System.out.println(answer4 + " is the only planet that rotates clockwise, neat!");
    }
}
