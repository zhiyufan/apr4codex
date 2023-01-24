package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < m; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            for (int j = left; j <= right; j++) {
                temp = temp ^ arr[j];
                if (temp == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                temp = 0;
            }
        }
        return result;
    }

    
}