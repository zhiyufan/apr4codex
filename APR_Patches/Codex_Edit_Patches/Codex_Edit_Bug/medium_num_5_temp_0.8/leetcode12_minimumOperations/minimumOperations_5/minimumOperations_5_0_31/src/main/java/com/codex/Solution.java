package com.codex;

import java.util.*;

public class Solution {
public boolean isGoodArray(int[] nums) {
    
    int target = nums[0];
    for(int num : nums){
        target = gcd(target, num);
    }

    return target == 1;
}

// Greatest common divisor
public int gcd(int a, int b) {
    if(b == 0){
        return a;
    }
    return gcd(b, a % b);
}
}