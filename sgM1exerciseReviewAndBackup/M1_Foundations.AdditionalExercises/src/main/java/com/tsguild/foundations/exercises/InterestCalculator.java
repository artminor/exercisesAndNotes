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
public class InterestCalculator {

    public static void main(String[] args) {
        double initialAmt = 0, total = 0, interestRate = 0, rateOption = 0, yearsInFund = 0, interestEarned = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much would you like to invest? ");
        initialAmt = Integer.parseInt(sc.nextLine());
        System.out.print("What is the annual interest rate(%)? ");
        interestRate = Integer.parseInt(sc.nextLine());
        System.out.print("How many years the money is to stay in the fund? ");
        yearsInFund = Integer.parseInt(sc.nextLine());
        System.out.print("Enter compound option: ie. 1=annually 4=quarterly 12=monthly 365=daily ");
        rateOption = Integer.parseInt(sc.nextLine());

        for (int year = 1; year <= yearsInFund; year++) {
            total = initialAmt * (1 + (interestRate / rateOption / 100));
            total = (total - initialAmt) * rateOption + initialAmt;
            interestEarned = total - initialAmt;
            System.out.println("\nYear: " + year
                    + "\nPrincipal at beginning of the year: " + roundNum(initialAmt)
                    + "\nTotal amount of interest earned for the year: " + roundNum(interestEarned)
                    + "\nPrincipal at the end of the year: " + roundNum(total));
            initialAmt = total;
        }
    }

    public static double roundNum(double num) {
        return (double) Math.round(num * 100) / 100;
    }

}