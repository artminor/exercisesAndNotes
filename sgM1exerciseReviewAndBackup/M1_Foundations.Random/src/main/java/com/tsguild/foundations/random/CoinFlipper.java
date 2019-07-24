/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.random;

import java.util.Random;

/**
 *
 * @author Jun
 */
public class CoinFlipper {
    public static void main(String[] args) {
        boolean result;
        String coinSide;
        Random rBoolean = new Random();
        result = rBoolean.nextBoolean();
        
        if(result){
            coinSide = "TAILS!";
        }else{
            coinSide = "HEADS!";
        }
        System.out.println("Ready, Set, Flip...!!");
        System.out.println("You got " + coinSide);
    }
}
