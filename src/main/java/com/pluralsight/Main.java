package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int testScores [] = {23,45,81,92,100,76};

        int max =  testScores[0];
        int min = testScores[0];
// this for loop goes through the entire array and compares whether the number that's in the array is greater than the max
        for(int i = 0; i < testScores.length; i++){
            if(testScores[i] > max){
                max = testScores[i];
            }// this says if the index is less than the min which starts from the first index which is 0
            if(testScores[i] < min){
                min = testScores[i];
            }
        }
        System.out.println("Maximum score is " + max);
        System.out.println("Minimum score is " + min);
    }
}
