/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class ForTimesFor {

    public static void main(String[] args) {
        int inputNum, product, inputProduct;
        int correctCounter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Which times table shall I recite? ");
        inputNum = Integer.parseInt(sc.nextLine());

        for (int timesTable = 1; timesTable < 16; timesTable++) {
            product = timesTable * inputNum;
            System.out.print(timesTable + " * " + inputNum + " is: ");
            inputProduct = Integer.parseInt(sc.nextLine());
            if (inputProduct == product) {
                System.out.println("Correct!");
                correctCounter++;
            } else {
                System.out.println("Sorry no, the answer is : " + product);
            }
        }
        System.out.println("You got " + correctCounter + " correct.");
    }
}
