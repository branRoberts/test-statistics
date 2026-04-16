package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int testScores [] = {23,45,81,92,100,76};

        int max =  testScores[0];
        int min = testScores[0];
// this for loop goes through the entire arrary and compares whether the number thats in the array is greater than the max
        for(int i = 0; i < testScores.length; i++){
            if(testScores[i] > max){
                max = testScores[i];
            }
        }
        System.out.println("Maximum score is " + max);
    }
}
