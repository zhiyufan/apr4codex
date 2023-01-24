package com.codex;

import java.util.*;

public class Solution {
package g3.com.interview;

import java.util.Scanner;

//Java program to find average of b numbers 
//entered by user using arrays 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k:");
        int k = sc.nextInt();
        System.out.println("enter the size of the array:");
        int len = sc.nextInt();
        System.out.println("enter the values of the array:");
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        double avg[] = getAverages(nums, k);
        System.out.println("Averages are: ");
        for (int i = 0; i < avg.length; i++) {
            System.out.print(avg[i] + " ");
        }
    }

    public static int[] getAverages(int[] nums, int k) {
        double[] avgs = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || j >= nums.length) {
                    continue;
                }
                sum += nums[j];
            }
            avgs[i] = (double) sum / (2 * k + 1);
        }
        return avgs;
    }

}
}