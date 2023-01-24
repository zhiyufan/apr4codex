package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] mas1 = new int[5];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 10);
        }

        int[] mas2 = new int[10];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 10);
        }

        System.out.println("First array is: " + Arrays.toString(mas1));
        System.out.println("Second array is: " + Arrays.toString(mas2));

        int[] result = new int[mas1.length + mas2.length];
        for (int i = 0; i < mas1.length; i++) {
            result[i] = mas1[i];
        }
        for (int j = 0; j < mas2.length; j++) {
            result[mas1.length + j] = mas2[j];
        }

        System.out.println("Combined array is: " + Arrays.toString(result));
    }

}
}