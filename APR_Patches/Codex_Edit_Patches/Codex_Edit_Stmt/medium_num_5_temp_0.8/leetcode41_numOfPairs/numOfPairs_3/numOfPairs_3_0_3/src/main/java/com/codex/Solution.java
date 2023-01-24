package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
<<<<<<< HEAD
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) || Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) ans++;
            }
        }
        return ans;
    }

=======
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) ||
                    Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target))
                    return ans++;
            }
        }
        return ans;
>>>>>>> 0b2c67cfb7bb8c843bdb94f429d17e9b59e8a0f0
    
}