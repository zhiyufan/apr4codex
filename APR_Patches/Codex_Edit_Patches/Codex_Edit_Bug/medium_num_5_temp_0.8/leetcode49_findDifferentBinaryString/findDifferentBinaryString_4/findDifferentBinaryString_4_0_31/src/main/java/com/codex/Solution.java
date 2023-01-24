package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Solution {

    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];

        for (String num : nums) {
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    row[i] += 1;
                } else {
                    col[i] += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums[0].length(); i++) {
            if (row[i] > col[i]) {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [] numbers = new String[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextLine();
        }
        
        System.out.println(findDifferentBinaryString(numbers));
    }
}
}