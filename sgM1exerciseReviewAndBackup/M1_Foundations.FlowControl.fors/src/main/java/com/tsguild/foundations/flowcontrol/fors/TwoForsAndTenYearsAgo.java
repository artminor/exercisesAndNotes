/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class TwoForsAndTenYearsAgo {
        public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = userInput.nextInt();

        //start at 0, ends at 10, count by 1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }
        
        System.out.println("\nI can count backwards using a different way too...");

        //start at year given, ends at year-10, countdown increment is 1
        //to me, this is slightly clearer because it's initialization and termination 
        //numbers used are directly assigned by the number given by user
        for (int i = year; i >= year - 20; i--) {
            System.out.println( (year - i) + " years ago would be " + i);
        }
    }
}
