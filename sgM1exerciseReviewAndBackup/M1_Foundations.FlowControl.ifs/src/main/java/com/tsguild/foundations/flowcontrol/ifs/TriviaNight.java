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
public class TriviaNight {

    public static void main(String[] args) {
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        Scanner sc = new Scanner(System.in);
        int correctNum = 0;
        int answer = 0;

        System.out.println("FIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.print("1) Source Code          ");
        System.out.println("2) Assembly Language");
        System.out.print("3) C#            ");
        System.out.println("4) Machine Code");
        System.out.print("YOUR ANSWER: ");
        answer = Integer.parseInt(sc.nextLine());
        if (answer == 4) {
            correctNum++;
        }
        answer = 0;

        System.out.println("SECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.print("1) Grace Hopper          ");
        System.out.println("2) Alan Turing");
        System.out.print("3) Charles Babbage            ");
        System.out.println("4) Larry Page");
        System.out.print("YOUR ANSWER: ");
        answer = Integer.parseInt(sc.nextLine());
        if (answer == 2) {
            correctNum++;
        }
        answer = 0;

        System.out.println("LAST QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.print("1) Serenity          ");
        System.out.println("2) The Battlestar Galactica");
        System.out.print("3) The USS Enterprise            ");
        System.out.println("4) The Millennium Falcon");
        System.out.print("YOUR ANSWER: ");
        answer = Integer.parseInt(sc.nextLine());
        if (answer == 3) {
            correctNum++;
        }
        answer = 0;

        if (correctNum > 0) {
            System.out.println("Nice job - you got " + correctNum + " correct!");
        } else {
            System.out.println("You didn't get anything right, really? Let's try again!");
        }
    }

}
