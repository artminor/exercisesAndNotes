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
public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];

        // Code Recipe for fruit salad should go here!
        int appleCounter = 0;
        int orangeCounter = 0;
        int fruitSaladIndex = 0;
        for (String individualFruit : fruit) {
            if (individualFruit.contains("berry")) {
                fruitSalad[fruitSaladIndex] = individualFruit;
                fruitSaladIndex++;
            } else if (individualFruit.contains("Apple") && appleCounter < 3) {
                fruitSalad[fruitSaladIndex] = individualFruit;
                appleCounter++;
                fruitSaladIndex++;
            } else if (individualFruit.contains("Orange") && orangeCounter < 2) {
                fruitSalad[fruitSaladIndex] = individualFruit;
                orangeCounter++;
                fruitSaladIndex++;
            } else if (!individualFruit.contains("Tomato") && !individualFruit.contains("Apple") && !individualFruit.contains("Orange")){
                if (fruitSaladIndex < 12)  {
                    fruitSalad[fruitSaladIndex] = individualFruit;
                    fruitSaladIndex++;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(fruitSalad));
    }
}
