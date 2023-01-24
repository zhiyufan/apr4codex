package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        int[] count = new int[10];
        for (int i = 0; i < num.length(); i++) {
            count[num.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            if (count[i] > count[change[i]]) {
                swap(count, i, change[i]);
            }
        }

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }

    private static void swap(int[] num, int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

    public static void main(String[] args) {
        int[] change = {9, 0, 6, 2, 1, 2, 3, 3, 3, 2};
        String num = "123123123";
        System.out.println(maximumNumber(num, change));
    }

    
}