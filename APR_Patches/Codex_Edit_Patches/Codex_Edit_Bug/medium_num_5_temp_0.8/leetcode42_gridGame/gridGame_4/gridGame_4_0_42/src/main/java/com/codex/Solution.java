package com.codex;

import java.util.*;

public class Solution {
int max = Integer.MIN_VALUE;
public int minStep(int n,int sum){
    if (n == 0){
        if (sum < max)
            return max;
        return sum;
    }
    if(n % 2 == 0){
        return max = Math.max(minStep(n/2,sum+1),max);
    }
    else 
        return max = Math.max(minStep(n-1,sum+1),max);
}

int minimumSteps(int n) {
    int sum = 0;
    return minStep(n,sum);
}

    
}