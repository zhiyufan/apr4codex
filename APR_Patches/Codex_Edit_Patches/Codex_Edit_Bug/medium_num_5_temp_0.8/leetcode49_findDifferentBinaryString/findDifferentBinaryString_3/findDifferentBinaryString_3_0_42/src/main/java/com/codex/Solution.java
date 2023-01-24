package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class ConvertBinaryToInt {
    public int binaryStringToInt(String s) {
        int n = s.length();
        String reverse = "";
        for (int i = n - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        int sum = 0;
        int multiplier = 1;
        for (int i = 0; i < n; i++) {
            if (reverse.charAt(i) == '1') {
                sum += multiplier;
            }
            multiplier *= 2;
        }
        return sum;
    }

    public String findDifferentBinaryString(int[] nums) {
        n = nums.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(nums[i]);
            if (s.length() < 32) {
                int diff = 32 - s.length();
                for (int j = 0; j < diff; j++) {
                    s = "0" + s;
                }
            }
            list.add(s);
        }
        String[] arr = list.toArray(new String[0]);
        return findDifferentBinaryString(arr);
    }

    public int binaryToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                num += Math.pow(2, i);
            }
        }
        return num;
    }

    public String findDifferentBinaryString(String[] nums) {
        // s.length == 32
        
        int n = nums[0].length();
        char[][] char2D = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char2D[i][j] = nums[i].charAt(j);
            }
        }
        String s = "";
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j][i] == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

}
}