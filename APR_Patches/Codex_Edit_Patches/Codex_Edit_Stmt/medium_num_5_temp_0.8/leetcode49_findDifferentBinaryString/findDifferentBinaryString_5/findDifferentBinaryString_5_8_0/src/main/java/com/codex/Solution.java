package com.codex;

import java.util.*;

public class Solution {
public class Main {
    private static int[] findUniqueBit(String[] nums) {
        int[] result = new int[nums.length];
        String[] binaryValues = new String[nums.length];
        for (int i = 0; i < binaryValues.length; i++) {
            // System.out.println("nums[i] = " + nums[i]);
            int num = Integer.parseInt(nums[i]);
            StringBuilder sb = new StringBuilder();
            while (num > 0) {
                sb.append(num % 2 + "");
                num /= 2;
            }
            String binary = sb.reverse().toString();
            // System.out.println("binary = " + binary);
            binaryValues[i] = binary;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    result[i]++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] nums = {"2", "9", "0", "43", "92", "90", "5", "26", "29", "30"};
        int[] results = findUniqueBit(nums);
        for (int i = 0; i < results.length; i++) {
            System.out.println("results[" + i + "] = " + results[i]);
        }
    }
}
}