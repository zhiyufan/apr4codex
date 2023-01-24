package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int satisfied = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            satisfied += grumpy[i] == 0 ? customers[i] : 0;
        }
        int max = satisfied;
        for (int i = 0; i < X; i++) {
            satisfied += grumpy[i] == 1 ? customers[i] : 0;
        }
        max = Math.max(max, satisfied);
        for (int i = X; i < n; i++) {
            int temp = satisfied - (grumpy[i - X] == 1 ? customers[i - X] : 0) + (grumpy[i] == 1 ? customers[i] : 0);
            satisfied = temp;
            max = Math.max(max, temp);
        }
        return max;
    } 
}
}