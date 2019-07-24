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
public class LazyTeenager {

    public static void main(String[] args) {
        int timesYelled = 1;
        boolean clean = false;
        int cleanChance = 5;
        Random rClean = new Random();

        do {
            System.out.println("Clean your room!! (x" + timesYelled + ")");
            timesYelled++;
            clean = cleanChance >= rClean.nextInt(100)+1;

            if (clean) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            } else {
                cleanChance += 5;
            }

            if (timesYelled > 15) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        } while (clean == false);

    }

}
