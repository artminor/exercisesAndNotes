/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.ifs;

/**
 *
 * @author Jun
 */
public class SpaceRustlers {
        public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        //if there are more aliens than spaceships, let's get going!
        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
            
         //otherwise there aren't enough aliens to drive spaceships
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        //there's a just right amount of room for cows
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        //if more cows than spaceships, not enough room for cows
        //if else is removed, it'll still produce the same result in this case
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        //otherwise not enough cows because there are too many ships
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if(aliens>cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        }else{
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }
    }
}
