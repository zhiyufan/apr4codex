package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }
    public static void test(String num, int[] change) {
        System.out.println("num: " + num + " change: " + Arrays.toString(change));
        System.out.println("maximumNumber: " + maximumNumber(num, change));
    }

    public static void main(String[] args) {
        test("6666", new int[]{6,5,6,5,6,5});
        test("9999", new int[]{9,8,9,8,9,8});
        test("1111", new int[]{1,2,3,4,5,6});
        test("1234", new int[]{1,2,3,4,5,6});
        test("456654", new int[]{1,2,3,4,5,6});
        test("286332", new int[]{1,2,3,4,5,6});
        test("81632", new int[]{1,2,3,4,5,6});
    }
    }



    
}