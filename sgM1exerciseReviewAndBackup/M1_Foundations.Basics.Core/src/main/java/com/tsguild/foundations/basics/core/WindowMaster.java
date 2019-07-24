/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.basics.core;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class WindowMaster {

    public static void main(String[] args) {
        float height;
        float width;

//        String stringHeight;
//        String stringWidth;

        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter window height: ");
//        stringHeight = sc.nextLine();
//        System.out.println("Please enter window width: ");
//        stringWidth = sc.nextLine();
//
//        height = Float.parseFloat(stringHeight);
//        width = Float.parseFloat(stringWidth);

        height = readValue("Please enter the window height");
        width = readValue("Please enter the window width");

        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        cost = areaOfWindow * 3.5f + perimeterOfWindow * 2.25f;

        System.out.println("window height = " + height);
        System.out.println("window width = " + width);
        System.out.println("window area = " + areaOfWindow);
        System.out.println("window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }

    public static float readValue(String prompt) {
        // declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        // print prompt to Console
        System.out.println(prompt);
        // read value into String data type
        String input = sc.nextLine();
        // convert the String to a float
        float floatVal = Float.parseFloat(input);
        // return the float value
        return floatVal;
    }
}
