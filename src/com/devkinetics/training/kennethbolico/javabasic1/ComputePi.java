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
public class ComputePi {

    public static void main(String[] args) {
        int maxDenom = 10000000;
        double sum = 0;
        for (int denom = 1; denom <= maxDenom; denom += 2) {
            if (denom % 4 == 1) {
                sum += 1.0 / denom;
            } else if (denom % 4 == 3) {
                sum -= 1.0 / denom;
            }
        }

        sum *= 4;
        System.out.println("The sum is " + sum);
    }

}
