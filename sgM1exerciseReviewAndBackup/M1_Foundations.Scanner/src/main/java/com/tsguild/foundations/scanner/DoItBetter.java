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
public class DoItBetter {

    public static void main(String[] args) {
        int miles, hotdogs, languages;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many miles can you run? ");
        miles = Integer.parseInt(sc.nextLine());
        miles = miles * 2 + 1;
        System.out.println("I can run " + miles + " miles!");
        System.out.print("How many hotdogs can you eat? ");
        hotdogs = Integer.parseInt(sc.nextLine());
        hotdogs = hotdogs * 2 + 1;
        System.out.println("I can eat " + hotdogs + " hotdogs!");
        System.out.print("How many languages do you know? ");
        languages = Integer.parseInt(sc.nextLine());
        languages = languages * 2 + 1;
        System.out.println("I know " + languages + " languages!");
    }
}
