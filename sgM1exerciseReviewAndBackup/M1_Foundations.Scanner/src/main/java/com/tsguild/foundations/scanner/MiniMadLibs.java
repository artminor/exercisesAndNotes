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
public class MiniMadLibs {

    public static void main(String[] args) {
        String noun, adj, anotherNoun, num, anotherAdj, pluralNoun,
                anotherPluralNoun, oneMoreNoun, verbPresent, verbPast;
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play MAD LIBS!");
        System.out.print("I need a noun: ");
        noun = sc.nextLine();
        System.out.print("Now an adj: ");
        adj = sc.nextLine();
        System.out.print("Another noun: ");
        anotherNoun = sc.nextLine();
        System.out.print("And a number: ");
        num = sc.nextLine();
        System.out.print("Another adj: ");
        anotherAdj = sc.nextLine();
        System.out.print("A plural noun: ");
        pluralNoun = sc.nextLine();
        System.out.print("Another one: ");
        anotherPluralNoun = sc.nextLine();
        System.out.print("One more: ");
        oneMoreNoun = sc.nextLine();
        System.out.print("A verb (present tense): ");
        verbPresent = sc.nextLine();
        System.out.print("Same verb (past tense): ");
        verbPast = sc.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun + ": the " + adj + " frontier. These are the voyages of the starship " + anotherNoun
                + ". Its " + num + "-year mission: to explore the strange " + anotherAdj + " " + pluralNoun + ", to seek out "
                + anotherAdj + " " + anotherPluralNoun + " " + anotherAdj + " " + oneMoreNoun + ", to boldly " + verbPresent
                + " where no one has " + verbPast + " before.");
    }
}
