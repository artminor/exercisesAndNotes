/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class StayPositive {

    public static void main(String[] args) {
        int counter = 10;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("What number should I count down from? ");
        num = Integer.parseInt(sc.nextLine());

        System.out.println("");
        System.out.println("Here goes!");
        System.out.println("");

        while (num > -1) {
            System.out.print(num + " ");
            num--;
            counter--;
            if (num >= 0 && counter ==0) {
                System.out.println("");
                counter += 10;
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Whew, better stop there...!");

    }
}
