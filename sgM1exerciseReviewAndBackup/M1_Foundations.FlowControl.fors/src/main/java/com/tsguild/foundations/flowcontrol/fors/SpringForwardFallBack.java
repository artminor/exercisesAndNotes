/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.fors;

/**
 *
 * @author Jun
 */
public class SpringForwardFallBack {
        public static void main(String[] args) {

        System.out.println("It's Spring...!");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + ", ");
        }
        //start 0 for i =0, stop 9 for i<10
        //after update, start 1, stop 10
        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
        //start 10, stop 1
    }
}
