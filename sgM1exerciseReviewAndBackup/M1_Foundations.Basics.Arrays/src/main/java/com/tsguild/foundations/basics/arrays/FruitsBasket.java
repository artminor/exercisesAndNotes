/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.basics.arrays;

import java.util.Arrays;

/**
 *
 * @author Jun
 */
public class FruitsBasket {

    public static void main(String[] args) {
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};
        int orangeAmount = 0;
        int appleAmount = 0;
        // Fruit sorting code goes here!
        for (String eachFruit : fruit) {
            if ("Orange".equals(eachFruit)) {
                orangeAmount++;
            }
            if ("Apple".equals(eachFruit)) {
                appleAmount++;
            }
        }

        System.out.println("Total# of Fruit in Basket: " + fruit.length);
        System.out.println("Number of Apples: " + appleAmount);
        System.out.println("Number of Oranges: " + orangeAmount);

        String[] oranges = new String[33];
        String[] apples = new String[28];

        //unnecessary two arrays
        for (String individualFruit : fruit) {
            for (int orangeIndex = 0; orangeIndex < oranges.length; orangeIndex++) {
                if ("Orange".equals(individualFruit)) {
                    oranges[orangeIndex] = individualFruit;
                }
            }
            for (int appleIndex = 0; appleIndex < apples.length; appleIndex++) {
                if ("Apple".equals(individualFruit)) {
                    apples[appleIndex] = individualFruit;
                }
            }
        }

        System.out.println("Here are the oranges:\n" + Arrays.toString(oranges));
        System.out.println("Here are the apples:\n" + Arrays.toString(apples));
    }
}
