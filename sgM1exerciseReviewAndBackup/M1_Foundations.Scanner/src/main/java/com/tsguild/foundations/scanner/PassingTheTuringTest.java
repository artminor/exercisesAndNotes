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
public class PassingTheTuringTest {

    public static void main(String[] args) {
        
    String name, color, food;
    int number, coolNumber;
    Scanner userInput = new Scanner(System.in);
        System.out.println("Hello there!");
        System.out.print("What's your name? ");
        name = userInput.nextLine();
        System.out.print("Hi, " +name+"! What's your favorite color? ");
        color = userInput.nextLine();
        System.out.println("Huh, "+color+"? Mine's Electric Lime.");
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, "+name+"? ");
        food= userInput.nextLine();
        System.out.println("Really? "+food+"? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number? ");
        number = Integer.parseInt(userInput.nextLine());
        System.out.println(number + " is a cool number. Mine's -7.");
        coolNumber = number*-7;
        System.out.println("Did you know "+number+" * -7 is "+coolNumber+ "? That's a cool number too!" );
        System.out.println("Well, thanks for talking to me, "+name+"!");
    }
}
