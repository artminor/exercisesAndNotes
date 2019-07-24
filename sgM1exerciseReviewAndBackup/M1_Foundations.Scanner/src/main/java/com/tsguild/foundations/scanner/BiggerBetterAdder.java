/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class BiggerBetterAdder {
    public static void main(String[] args) {
        double num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to add: ");
        num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter second number to add: ");
        num2 = Double.parseDouble(sc.nextLine());
        sum = num1+num2;
        System.out.println("Sum is: " +sum);
    }
}
