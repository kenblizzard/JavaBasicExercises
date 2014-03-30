/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devkinetics.training.kennethbolico.javabasic1;

/**
 *
 * @author Ken
 */
public class TimeTable {

    public static void main(String[] args) {
        int nMax = 12;

        System.out.print("*  | ");
        for (int i = 1; i <= nMax; i++) { //print top row
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= nMax + 3; i++) { //print dash lines
            System.out.print("--");
        }
        System.out.println();
        for (int y = 1; y <= nMax; y++) { //print table
            System.out.print(y + "  |"); //print first column
            for (int x = 1; x <= nMax; x++) {
                System.out.print(" " + (x * y)); 
            }
            System.out.println();
        }
    }

}
