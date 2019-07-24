/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.exercises;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class Factorizor {

    public static void main(String[] args) {
        int input;

        Scanner sc = new Scanner(System.in);

        System.out.print("What number would you like to factor? ");
        input = Integer.parseInt(sc.nextLine());

        int[] factors = new int[input];

        System.out.println("The factors of " + input + " are:");

        int sum = 0;
        int primeSum = 0;
        for (int num = 1; num <= factors.length; num++) {
            if (input % num == 0) {
                factors[num - 1] = num;
                if (num != input) {
                    System.out.println(num);
                }
            } else {
                factors[num - 1] = 0;
            }
        }

        for (int index = 0; index < factors.length - 1; index++) {
            sum += factors[index];
        }

        String perfectMsg = "";
        String primeMsg = "";

        if (input != sum) {
            perfectMsg = " not";
        }

        if (sum > 1) {
            primeMsg = " not";
        }

        System.out.println(input + " is" + perfectMsg + " a perfect number.");
        System.out.println(input + " is" + primeMsg + " a prime number.");
    }
}
