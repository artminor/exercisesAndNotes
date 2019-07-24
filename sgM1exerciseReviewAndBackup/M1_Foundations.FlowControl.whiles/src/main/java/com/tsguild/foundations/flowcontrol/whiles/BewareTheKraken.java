/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class BewareTheKraken {

    public static void main(String[] args) {

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        String stop;
        String[] fish = {"Siamese fighting fish!", "guppy!", "neon tetra!", "magalodon!"};
        Random rFish = new Random();
        Scanner sc = new Scanner(System.in);

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while (depthDivedInFt < 36200) {
            //if while condition is true, the loop will continue to run
            //however, since there's a if condition set at 20000 ft, the program breaks out of the loop then
            //if there is no such condition, and there's no limit to depth of dive, then it would just keep going...
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");
            System.out.println("I see a " + fish[rFish.nextInt(fish.length)]);
            System.out.print("Do you want to stop? y/n : ");
            stop = sc.nextLine();

            if (stop.equals("n")) {
                if (depthDivedInFt >= 20000) {
                    System.out.println("Uhhh, I think I see a Kraken, guys ....");
                    System.out.println("TIME TO GO!");
                    break;
                }

            } else {
                System.out.println("Let's surface!");
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
