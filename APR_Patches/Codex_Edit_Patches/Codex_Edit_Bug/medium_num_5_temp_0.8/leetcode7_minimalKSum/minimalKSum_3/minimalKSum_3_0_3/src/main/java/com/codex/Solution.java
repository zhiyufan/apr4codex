package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, sum = 0;
        while (j != k) {
            if (arr[i] <= j + 1) {
                result.add(arr[i]);
                sum += arr[i];
                i++;
            } else {
                while (arr[i] > j + 1 && j != k) {
                    result.add(j + 1);
                    sum += j + 1;
                    j++;
                }
        }
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (i = k; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static long minimunKSum(int[] nums, int k){
        Arrays.sort(nums);       
        long result = 0; 
        int i = 0, j = 0;        
        while (i < nums.length && j < k){
            if (nums[i] <= j + 1) {
                result += nums[i++];                
            } else {                
                result += j + 1;
                j++;                
            }            
            }
        }

        while (j < k) {
            result += j + 1;
            j++;
        }

        return result;
    }

    
    
}