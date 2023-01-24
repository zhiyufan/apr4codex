package com.codex;

import java.util.*;

public class Solution {
def countElements(self, arr: List[int]) -> int:
        s = set(arr)
        return sum(i + 1 in s for i in arr)


Or

    public static int countElements(int[] nums) {
        

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] == nums[i] + 1) && (i != j)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    
}