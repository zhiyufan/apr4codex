package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;
        // sort the array 
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] i1, int[] i2){
                return i1[0] - i2[0];
            }
        }
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }

    
}