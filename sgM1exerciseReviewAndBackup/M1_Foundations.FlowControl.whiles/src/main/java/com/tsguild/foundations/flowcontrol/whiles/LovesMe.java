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
public class LovesMe {
    public static void main(String[] args) {
        System.out.println("Well here goes nothing...");
        int petals = 34;
         do{
             if(petals%2!=0){
             System.out.println("It LOVES me!");
             }else{
                 System.out.println("It loves me NOT!");
             }
             petals--;
         }while(petals>0);
         System.out.println("I knew it! It LOVES me!");
    }
    //I used a do while loop because I want the code to execute regardless of condition
    //then checks against the while condition and ends with a message when it's 0 petals
}
