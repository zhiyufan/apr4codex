package com.codex;

import java.util.*;

public class Solution {
public class Main{

    public static int countElements(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
    public static void main(String[] args) {
        int count = countElements(new int[]{1,1,1,0,4,4,4,4,4});
        System.out.println(count);
    }

}
        return count;
    }

    
}