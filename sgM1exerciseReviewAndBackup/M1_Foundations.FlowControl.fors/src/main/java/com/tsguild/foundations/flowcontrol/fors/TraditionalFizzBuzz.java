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
public class TraditionalFizzBuzz {

    public static void main(String[] args) {
        int input;
        int fizzbuzz = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much units fizzing and buzzing do you need in your life? ");
        input = Integer.parseInt(sc.nextLine());
        for (int count = 0; fizzbuzz < input; count++) {
            if (count == 0) {
                System.out.println(count);
                continue;
            }

            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("fizz buzz");
                fizzbuzz++;
            } else if (count % 3 == 0) {
                System.out.println("fizz");
                fizzbuzz++;
            } else if (count % 5 == 0) {
                System.out.println("buzz");
                fizzbuzz++;
            } else {
                System.out.println(count);
            }
        }
        System.out.println("TRADITION!!!!!");
    }
}
