package com.codex;

import java.util.*;

public class Solution {
public class algo {
    public static int numOfPairs(String[] nums, String target) {
        

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = 0;
        for (; i < nums.length; i++) {
        }
    }
}
}