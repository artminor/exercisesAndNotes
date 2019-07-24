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
public class FieldDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] team = {"Red Dragons", "Dark Wizards", "Moving Castles", "Golden Snitches",
            "Night Guards", "Black Holes"};

        String lastName;
        int teamIndex = 0;
        System.out.print("What’s your last name? ");
        lastName = sc.nextLine();
        if (lastName.compareTo("Baggins") < 0) {
            teamIndex = 0;
        } else if (lastName.compareTo("Dresden") < 0) {
            teamIndex = 1;
        } else if (lastName.compareTo("Howl") < 0) {
            teamIndex = 2;
        } else if (lastName.compareTo("Potter") < 0) {
            teamIndex = 3;
        } else if (lastName.compareTo("Vimes") < 0) {
            teamIndex = 4;
        } else {
            teamIndex = 5;
        }

        System.out.println("Aha! You're on the team \"" + team[teamIndex] + "\"!");
        System.out.println("Good luck in the games!");
    }
}
