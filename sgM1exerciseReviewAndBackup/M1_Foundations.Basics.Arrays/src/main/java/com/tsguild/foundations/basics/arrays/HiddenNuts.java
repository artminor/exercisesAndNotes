/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.basics.arrays;

import java.util.Random;

/**
 *
 * @author Jun
 */
public class HiddenNuts {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        // Nut finding code should go here! 
        for (int spotIndex = 0; spotIndex < hidingSpots.length; spotIndex++) {
            if ("Nut".equals(hidingSpots[spotIndex])) {
                System.out.println("Found it! It's in spot# " + spotIndex);
            }
        }
    }
}
