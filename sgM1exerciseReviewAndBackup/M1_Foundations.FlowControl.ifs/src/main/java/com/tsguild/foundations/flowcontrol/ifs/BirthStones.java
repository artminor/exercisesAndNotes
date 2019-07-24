/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class BirthStones {

    public static void main(String[] args) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] stone = {"Garnet", "Amethyst", "Aquamarine", "Diamond", "Emerald", "Pearl", "Ruby", "Peridot", "Sapphire", "Opal", "Topaz", "Turquoise"};
        int birthMonth;

        Scanner sc = new Scanner(System.in);

        System.out.print("What month's birthstone are you wanting to know? ");
        birthMonth = Integer.parseInt(sc.nextLine());

        if (birthMonth>=1 && birthMonth <= 12) {
            birthMonth--;
            System.out.println(month[birthMonth] + "'s birthstone is " + stone[birthMonth]);
        } else {
            System.out.println("I think you must be confused, " + birthMonth + " doesn't match a month.");
        }
    }
}
