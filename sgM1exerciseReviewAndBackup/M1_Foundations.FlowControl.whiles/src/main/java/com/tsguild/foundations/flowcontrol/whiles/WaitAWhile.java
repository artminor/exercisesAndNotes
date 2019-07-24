/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.whiles;

/**
 *
 * @author Jun
 */
public class WaitAWhile {
        public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 11;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
            //if time now is less than bedtime, then this loop runs until condition is no longer true
            //if timeNow++ is commented out, then condition is forever true, thus infinite loop
        }
        //if while condition was never true, then while loop is skipped and following lines are ran
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
