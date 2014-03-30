/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devkinetics.training.kennethbolico.javabasic1;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author Ken
 */
public class KeyboardScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputInt = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a floating point number: ");
        double inputFloat = Double.parseDouble(sc.nextLine());
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hi! " + name + ", the sum of " + inputInt + " and "
                + inputFloat + " is " + (inputInt + inputFloat));
    }

}
