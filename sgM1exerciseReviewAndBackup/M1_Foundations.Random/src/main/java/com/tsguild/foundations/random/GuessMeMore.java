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
public class GuessMeMore {

    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner sc = new Scanner(System.in);
        int pickedNum = randomizer.nextInt(201) - 100;

        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        System.out.print("Your guess: ");
        int userNum = Integer.parseInt(sc.nextLine());
        System.out.println("");

        while (userNum < -100 || userNum > 100) {
            System.out.print("Enter number between -100 and 100: ");
            userNum = Integer.parseInt(sc.nextLine());
        }
       
        if (userNum < pickedNum) {
            System.out.println("Ha, nice try - too low! Try Again!");
            System.out.print("Your guess: ");
            userNum = Integer.parseInt(sc.nextLine());
            System.out.println("");
        } else if (userNum > pickedNum) {
            System.out.println("Too bad, way too high! Try Again!");
            System.out.print("Your guess: ");
            userNum = Integer.parseInt(sc.nextLine());
            System.out.println("");
        } 
        
        if (pickedNum == userNum) {
            System.out.println("Wow, nice guess! That was it!");
        } else {
            System.out.println("Sorry, you're out of luck!");
        }

    }
}
