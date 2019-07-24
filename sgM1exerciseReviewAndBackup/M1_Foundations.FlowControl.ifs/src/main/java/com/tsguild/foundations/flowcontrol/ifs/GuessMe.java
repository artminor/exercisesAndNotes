/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.ifs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class GuessMe {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner sc = new Scanner(System.in);
        int pickedNum = randomizer.nextInt(10);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your guess: ");
        int userNum = Integer.parseInt(sc.nextLine());
        
        if(userNum<pickedNum){
        System.out.println("Ha, nice try - too low! I chose " + pickedNum + ".");
        }else if(userNum>pickedNum){
        System.out.println("Too bad, way too high! I chose " + pickedNum + ".");
        }else{
            System.out.println("Wow, nice guess! That was it!");
        }
        
    }
}
