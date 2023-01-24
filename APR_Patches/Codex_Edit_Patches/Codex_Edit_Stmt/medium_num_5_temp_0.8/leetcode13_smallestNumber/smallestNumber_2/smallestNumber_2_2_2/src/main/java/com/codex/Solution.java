package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
var n = num;
var nums = new ArrayList<>();
while (n > 0) {
    nums.add((int)(n % 10));
    n = n / 10;
}
Collections.sort(nums);
if (nums.get(0) == 0) {
    for (i in 1..nums.size() - 1) {
        if (nums.get(i) != 0) {
            nums.swap(0, i)
            break;
        }
}
n = 0;
for (i in nums) {
    n = 10 * n + i;
}
return n;
}
    }
    

    
}