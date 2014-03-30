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
public class CheckOddEven {

    public static void main(String[] args) {
        int number = 59;
        System.out.println("The number is " + number);
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
