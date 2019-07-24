/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Jun
 */
public class MaybeItLovesMe {

    public static void main(String[] args) {
        Random r = new Random();
        int min = 13;
        int max = 90;
        int petals = r.nextInt(max - min) + min;
        boolean love = r.nextBoolean();

        System.out.println("Well here goes nothing...");

        do {
            love = !love;
            if (love) {
                System.out.println("It LOVES me!");
            } else {
                System.out.println("It loves me NOT!");
            }
            petals--;
        } while (petals > 0);

        if (love) {
            System.out.println("Oh, wow! It really LOVES me!");
        } else {
            System.out.println("Awwww, bummer.");
        }
    }
}
