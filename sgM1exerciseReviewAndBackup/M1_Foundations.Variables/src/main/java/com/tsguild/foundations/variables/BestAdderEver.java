/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.variables;

/**
 *
 * @author Jun
 */
public class BestAdderEver {

    public static void main(String[] args) {
        int intNum = 5;
        float floatNum = 55;
        double doubleNum = 5.555;
        double sum = intNum + floatNum + doubleNum;

        System.out.println(intNum + "+" + floatNum + "+" + doubleNum);
        System.out.println("sum of all three nums are: " + sum);
    }
}
