package com.bdg;

import org.example.Algorithms1;
import org.example.ArraysToTest;

public class Main {
    public static void main(String[] args) {
        CustomArrays customArrays = new CustomArrays();
        System.out.println(customArrays.maxElementOf(new int[]{1, 2, 3, 4}));  //custom_arrays (my project)

        ArraysToTest toTest = new ArraysToTest(); //arrays_to_test (Angin's project)
        toTest.desArr();
        toTest.reverseArr();

        Algorithms1 algorithms1 = new Algorithms1(); //algorithm (Angin's project)
        algorithms1.largestPrimeFactor();
    }
}