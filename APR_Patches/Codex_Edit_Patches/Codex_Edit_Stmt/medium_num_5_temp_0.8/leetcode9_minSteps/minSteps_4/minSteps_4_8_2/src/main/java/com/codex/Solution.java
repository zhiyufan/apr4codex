package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int diff = 0;
        for(int num : nums)
            diff ^= num;
        diff &= -diff;
        for(int num : nums){
            if((num & diff) == 0)
                res[0] ^= num;
            else
                res[1] ^= num;
        }
        return res;
    }
}
}