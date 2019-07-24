/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.random;

import java.io.PrintStream;
import java.util.Random;

/**
 *
 * @author Jun
 */
public class FortuneCookie {

    public static void main(String[] args) {
        Random randomizer = new Random();

        String msg1 = "Those aren't the droids you're looking for.";
        String msg2 = "Never go in against a Sicilian when death is on the line!";
        String msg3 = "Coonies never die.";
        String msg4 = "With great power there must also come = great responsibility";
        String msg5 = "Never argue with the data.";
        String msg6 = "Try not. Do, or do not. There is no try";
        String msg7 = "You are a leaf on the wind, watch how you soar.";
        String msg8 = "Do absolutely nothing, and it will be everything that you thought it could be.";
        String msg9 = "Kneel before Zod.";
        String msg10 = "Make it so.";
        String[] randomMsg = {msg1, msg2, msg3, msg4, msg5, msg6, msg7, msg8, msg9, msg10};

        int x = randomizer.nextInt(9);
        
        System.out.println("Your Geek Forturen : "+ randomMsg[x]);
        
    }
}
