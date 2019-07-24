/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.basics.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author Jun
 */
public class SimpleSort {

    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};

        int[] wholeNumbers = new int[24];

        // Sorting code should go here!
        System.arraycopy(firstHalf, 0, wholeNumbers, 0, firstHalf.length);
        System.arraycopy(secondHalf, 0, wholeNumbers, firstHalf.length, secondHalf.length);

        int temp;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
//        for (int numIndex = 0; numIndex < wholeNumbers.length; numIndex++) {
            for (int currentIndex = 0; currentIndex < wholeNumbers.length - 1; currentIndex++) {
                if (wholeNumbers[currentIndex] > wholeNumbers[currentIndex + 1]) {
                    temp = wholeNumbers[currentIndex];
                    wholeNumbers[currentIndex] = wholeNumbers[currentIndex + 1];
                    wholeNumbers[currentIndex + 1] = temp;
                    swapped = true;
                }
            }
//        }
        }
        System.out.println("Here ya go - all nice and ordered:\n" + Arrays.toString(wholeNumbers));
    }
}
