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
public class HarmonicSum {

    public static void main(String[] args) {
        int maxDenominator = 5000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += (1.0 / denominator);
        }

        for (int denominator = maxDenominator; denominator >= 1; denominator--) {
            sumR2L += (1.0 / denominator);
        }

        System.out.println("The sum of Left to Right is " + sumL2R);
        System.out.println("The sum of Right to Left is " + sumR2L);

        System.out.println("There difference is " + (sumR2L - sumL2R));
    }

}
