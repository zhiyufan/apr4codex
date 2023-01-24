package com.codex;

import java.util.*;

public class Solution {

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nums = new String[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.next();
        }
        System.out.println(findDifferentBinaryString(nums));
    }
    public static String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int ones = 0;
            for(int j = 0; j < n; j++) {
                if(nums[j].charAt(i) == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                s.append('0');
            } else {
                s.append('1');
            }
        }
        return s.toString();
    }

}
}