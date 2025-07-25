package com.practice.array;

import java.util.Arrays;

public class CheckArraysAreEqual {
    public static void main(String[] args){
        int[] input1 = {1,5,6,8,10,12};
        int[] input2 = {1,6,5,8,12,10};
        int[] output1 = Arrays.stream(input1).distinct().sorted().toArray();
        int[] output2 = Arrays.stream(input2).distinct().sorted().toArray();
        System.out.println(Arrays.equals(output1, output2));
    }
}
