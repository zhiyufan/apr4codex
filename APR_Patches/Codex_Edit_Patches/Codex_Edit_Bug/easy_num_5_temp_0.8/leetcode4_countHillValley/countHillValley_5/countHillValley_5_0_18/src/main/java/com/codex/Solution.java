package com.codex;

import java.util.*;

public class Solution {
public class CountHillValley {

	public static int countHillValley(int[] nums) {

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
}