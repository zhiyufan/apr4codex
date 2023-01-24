package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int i = 0;
        int j = 0;
        while (i < cost.length) {
            sum += cost[i];
            i = i + 3;
        }
        while (j < cost.length) {
            sum1 += cost[j];
            j = j + 1;
        }
        int k = 1;
        while (k < cost.length) {
            sum2 += cost[k];
            k = k + 3;
        }
        int l = 2;
        while (l < cost.length) {
            sum3 += cost[l];
            l = l + 3;
        }
        
        return Math.min(Math.min(sum, sum1), Math.min(sum2, sum3));
    }

}
}