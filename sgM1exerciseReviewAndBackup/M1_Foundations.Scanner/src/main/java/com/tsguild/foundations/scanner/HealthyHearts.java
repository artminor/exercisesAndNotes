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
public class HealthyHearts {

    public static void main(String[] args) {
        double age, heartrate, lowerBound, upperBound;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = Double.parseDouble(sc.nextLine());
        heartrate = 220 - age;
        lowerBound = Math.round(heartrate / 2);
        upperBound = Math.round(heartrate * .85);
        System.out.println("Your maximum heart rate should be " + heartrate + " per minute");
        System.out.println("Your target HR Zone is " + lowerBound + " - " + upperBound + " beats per minute");
    }
}
