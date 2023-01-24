package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    
    private class Pair {
        String first;
        String second;
        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
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
}