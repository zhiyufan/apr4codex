package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (Arrays.asList(nums).contains(nums[i] + 1))
            count++;
    }
    return count;
}

    
}