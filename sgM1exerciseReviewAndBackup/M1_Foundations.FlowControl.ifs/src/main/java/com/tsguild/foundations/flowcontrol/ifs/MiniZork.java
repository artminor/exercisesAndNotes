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
public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
                
            } else if (action.equals("stick your hand in")) { 
                System.out.println("Ouch! Something bit you!");
                System.out.println("The pain is unbearable...");
                System.out.println("Do you rush to the nearby hospital? ");
                action = userInput.nextLine();
                
                if(action.equals("yes")){
                    System.out.println("You tried to rush to the Emergency Room.");
                    System.out.println("You barely made it on time...");
                    System.out.println("Luckily, you were saved by the doctors.");
                }else if(action.equals("no")){
                    System.out.println("You chose to suck out the blood like how movies do it...");
                    System.out.println("You start feeling dizzy...");
                    System.out.println("It was a poisonous bite, you died from the poisoning...");
                }
            }
            
        } else if (action.equals("go to the house")) {
            System.out.println("You crank the door open...");
            System.out.println("There is no one here and it's scary.");
            System.out.println("Do you turn back or explore inside?");
            action = userInput.nextLine();
            
            if(action.equals("turn back")){
                System.out.println("The door suddenly shuts behind you...");
                System.out.println("You're trapped!");
                System.out.println("Scream for help or try figure out the lock mechanism?");
                action=userInput.nextLine();
                
                if(action.equals("scream for help")){
                    System.out.println("You scream at the tip of your lungs for hours...");
                    System.out.println("No one seems to be around to rescue you.");
                    System.out.println("Eventually you die of starvation...");
                }else if(action.equals("figure out the lock mechanism")){
                    System.out.println("You spent hours fiddling with the lock");
                    System.out.println("You hear a snap and the door breaks open...");
                    System.out.println("You ran as fast as you can away from the house");
                    System.out.println("You're glad you made it alive.");
                }
                
            }else if(action.equals("explore inside")){
                System.out.println("You walked a few steps in...");
                System.out.println("Suddenly the door locks behind you...");
                System.out.println("You ran to the door but it's too late...");
                System.out.println("You look to the window and you see a shadow");
                System.out.println("follow or don't follow?");
                action = userInput.nextLine();
                
                if(action.equals("follow")){
                    System.out.println("You ran towards the shadow");
                    System.out.println("It turns out to be a man with a machette");
                    System.out.println("He suddenly swings his weapon towards you");
                    System.out.println("You couldn't dodge in time, you got killed.");
                }else if(action.equals("don't follow")){
                    System.out.println("You looked around the house some more...");
                    System.out.println("You found a back door...");
                    System.out.println("It's not locked! You rushed out of there while still alive...");
                }
            }
        }
    }
}
