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
public class YourLifeInMovies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        int birthYear;
        String msg1965 = "MASH has been around for almost half a century!";
        String msg1975 = "The original Jurassic Park release is closer to the lunar landing, than today.";
        String msg1985 = "Also, Space Jam came out not last decade, but the one before THAT";
        String msg1995 = "And that the first Harry Potter came out over 15 years ago!";
        String msg2005 = "Did you know that Pixar's 'Up' came out half a decade ago?";
        System.out.print("Hey, let's play a game! What's your name? ");
        userName = sc.nextLine();
        System.out.println();
        System.out.print("Ok, " + userName + " when were you born? ");
        birthYear = Integer.parseInt(sc.nextLine());
        System.out.println();
        System.out.println("Well " + userName + "...");

        if (birthYear < 2005) {
            System.out.println(msg2005);
            if (birthYear < 1995) {
                System.out.println(msg1995);
                if (birthYear < 1985) {
                    System.out.println(msg1985);
                    if (birthYear < 1975) {
                        System.out.println(msg1975);
                        if (birthYear < 1965) {
                            System.out.println(msg1965);
                        }
                    }
                }
            }
        }else{
            System.out.println("You are still a young baby!");
        }
    }
}
