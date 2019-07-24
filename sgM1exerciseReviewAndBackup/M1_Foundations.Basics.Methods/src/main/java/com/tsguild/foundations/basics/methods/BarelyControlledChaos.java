/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.basics.methods;

import java.util.Random;

/**
 *
 * @author Jun
 */
public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = colorMethod(); // call color method here 
        String animal = animalMethod(); // call animal method again here 
        String colorAgain = colorMethod(); // call color method again here 
        int weight = numberMethod(5, 200); // call number method, 
        // with a range between 5 - 200 
        int distance = numberMethod(10, 20); // call number method, 
        // with a range between 10 - 20 
        int number = numberMethod(10000, 20000); // call number method, 
        // with a range between 10000 - 20000 
        int time = numberMethod(2, 6); // call number method, 
        // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String colorMethod() {
        Random rand = new Random();
        String[] colors = {"magenta", "orange-tined red", "flesh-colored", "bright green", "yellow"};
        int colorPosition = rand.nextInt(colors.length);
        return colors[colorPosition];
    }

    private static String animalMethod() {
        Random rand = new Random();
        String[] animals = {"mammoth", "unicorn", "seahorse", "elephant", "giraffe"};
        int animalPosition = rand.nextInt(animals.length);
        return animals[animalPosition];
    }

    private static int numberMethod(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max + 1 - min) + min;
    }

}
