package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minimumCost(int N, int[][] connections) {
        int[] father = new int[N+1];
        for(int i=0; i<=N; i++) {
            father[i] = i;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int res = 0;
        for (int curCost : cost) {
            if (curCost <= min) {
                res += min;
                secondMin = min;
                min = curCost;
            } else if (curCost < secondMin) {
                res += curCost;
                secondMin = curCost;
            } else {
                res += secondMin;
            }
        }
        return res;
    }
}