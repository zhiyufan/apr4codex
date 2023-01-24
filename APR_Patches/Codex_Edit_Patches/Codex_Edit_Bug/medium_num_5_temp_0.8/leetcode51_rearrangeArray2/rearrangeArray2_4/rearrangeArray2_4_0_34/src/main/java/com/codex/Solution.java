package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Array {
    static boolean b;
    static int i;
    static char c;


    public static void main(String[] args) {

        System.out.println(b);
        System.out.println(i);
        System.out.println(c);

        int[] arr = new int[]{12, 23, 34};

        System.out.println(arr.length);

        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] arr3 = new int[3][];
        arr3[0] = new int[]{1,2,3};
        arr3[1] = new int[2];
        arr3[2] = new int[]{4,5,6};

        int[][] arr4 = new int[3][3];
        arr4[0] = new int[]{1,2,3};
        arr4[1] = new int[]{4,5,6};
        arr4[2] = new int[]{7,8,9};

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }


        int[][] arr5 = new int[3][];
        int[] a1 = new int[]{1,2,3};
        int[] a2 = new int[]{4,5,6};
        int[] a3 = new int[]{7,8,9};
        arr5[0] = a1;
        arr5[1] = a2;
        arr5[2] = a3;

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static double aver(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    
}