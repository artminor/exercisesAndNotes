/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.variables;

import javax.swing.GroupLayout.Alignment;

/**
 *
 * @author Jun
 */
public class MenuOfChampions {

    public static void main(String[] args) {

        String itemOne = "Slice of Big Rico Pizza";
        String itemTwo = "Invisible Strawberry Pie";
        String itemThree = "Denver Omelet";
        double itemOnePrice = 500.00;
        double itemTwoPrice = 2.00;
        double itemThreePrice = 1.50;

        System.out.println("=^..^=   =^..^=   =^..^=    =^..^=    =^..^=    =^..^=    =^..^=");
        System.out.println("WELCOME TO RESTAURANT NIGHT VALE!");
        System.out.println("Today's Menu Is...");
        System.out.println("=^..^=   =^..^=   =^..^=    =^..^=    =^..^=    =^..^=    =^..^=");
        System.out.println(itemOne + "          $ "+itemOnePrice);
        System.out.println(itemTwo + "          $ "+itemTwoPrice);
        System.out.println(itemThree+"                  $"+itemThreePrice);
    }
}
