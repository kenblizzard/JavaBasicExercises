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
public class Product1ToN {

    public static void main(String[] args) {
        int n = 10;
        int product = 1;
        for (int i = product; i <= n; i++) {
            product *= i;
        }
        System.out.println("The product is " + product);
    }

}
