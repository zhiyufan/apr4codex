package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    class Solution {
        public int[] findRightInterval(int[][] intervals) {
        
            if (intervals == null || intervals.length == 0) {
                return new int[0];
            }
            
            int[] start = new int[intervals.length];
            for (int i = 0; i < intervals.length; i++) {
                start[i] = intervals[i][0];
            }
            Arrays.sort(start);
            int[] res = new int[intervals.length];
            for (int i = 0; i < intervals.length; i++) {
                int next = binarySearch(start, intervals[i][1]);
                if (next != -1) {
                    res[i] = next;
                } else {
                    res[i] = -1;
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