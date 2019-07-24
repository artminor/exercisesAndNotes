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
public class ForTimes {
    public static void main(String[] args) {
        int inputNum;
        int product;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Which times table shall I recite? ");
        inputNum = Integer.parseInt(sc.nextLine());
        
        for(int timesTable = 1; timesTable<16; timesTable++){
            product = timesTable*inputNum;
            System.out.println(timesTable + " * "+ inputNum + " is: "+product);
        }
    }
}
