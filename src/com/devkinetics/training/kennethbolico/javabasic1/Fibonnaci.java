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
public class Fibonnaci {

    private static int sum = 0;
    private static int nMax = 20;

    public static void main(String[] args) {
        //sumFibonnaci();
         sumFibonnaci(1, 1, 1);
    }

    private static void sumFibonnaci(int a, int b, int counter) {

        if (counter == nMax) {
            System.out.println("The sum is " + sum);
            System.out.println("The average is " + ((sum + 0.0) / nMax));
        } else {
            sum += b;
            System.out.print(b + " ");
            sumFibonnaci(b, a + b, counter + 1);
        }
    }

    private static void sumFibonnaci() {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonnaci numbers are: ");

        while (n <= nMax) {
            fn = (n - 1) + (n - 2);
            System.out.print(fn + " ");
            sum += fn;
            n++;
        }
        
        System.out.println("The average is " + ((sum + 0.0) / nMax));
    }

}
