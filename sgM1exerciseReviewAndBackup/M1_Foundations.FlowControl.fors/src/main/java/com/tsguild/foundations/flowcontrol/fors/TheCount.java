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
public class TheCount {
    public static void main(String[] args) {
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        
    int start, stop, increment;
    int ah = 0;
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Start at : ");
        start = Integer.parseInt(sc.nextLine());
        System.out.print("Stop at : ");
        stop = Integer.parseInt(sc.nextLine());
        System.out.print("Count by : ");
        increment = Integer.parseInt(sc.nextLine());
        
        for(int count = start; count <=stop; count=count+increment){
            System.out.print(count + " ");
            ah++;
            if(ah==3){
                System.out.println("- Ah ah ah!");
                ah=0;
            }
        }

    }
    
}
