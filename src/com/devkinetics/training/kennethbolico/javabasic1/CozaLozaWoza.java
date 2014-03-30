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
public class CozaLozaWoza {

    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 110;

        for (int number = lowerbound; number <= upperbound; number++) {
            if (number % 3 == 0) {
                System.out.print("Coza");
            }
            if (number % 5 == 0) {
                System.out.print("Loza");
            }
            if(number % 7 == 0)
                System.out.print("Woza");
            if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
                System.out.print(number);
            if(number % 11 == 0)
                System.out.println();
            else
                System.out.print(" ");
        }
    }

}
