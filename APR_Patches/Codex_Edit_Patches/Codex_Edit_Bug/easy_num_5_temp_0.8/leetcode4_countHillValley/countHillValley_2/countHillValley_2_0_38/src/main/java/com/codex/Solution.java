package com.codex;

import java.util.*;

public class Solution {
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int countHillValley(int[] nums)
    {

        int hills = 0, valleys = 0, i = 1;
        // if first and second element are equal
        if (nums[0] == nums[1])
            return 0;
        // if first element is bigger than second
        if (nums[0] > nums[1]) {
            valleys++;
            // if first and second element are equal
            if (nums[1] == nums[2])
                return 0;
        }
            // if first element is lower than second
        else {
            hills++;
            // if first and second element are equal
            if (nums[1] == nums[2])
                return 0;
        }
        while (i < nums.length - 1)
        {
            // if uphill
            if (nums[i] < nums[i + 1])
                while (i < nums.length - 1 && nums[i] <= nums[i + 1])
                    i++;
                hills++;
            // if downhill
            else if (nums[i] > nums[i + 1])
                while (i < nums.length - 1 && nums[i] >= nums[i + 1])
                    i++;
                valleys++;
            i++;
        }
        return hills +  valleys;
    }
}
}