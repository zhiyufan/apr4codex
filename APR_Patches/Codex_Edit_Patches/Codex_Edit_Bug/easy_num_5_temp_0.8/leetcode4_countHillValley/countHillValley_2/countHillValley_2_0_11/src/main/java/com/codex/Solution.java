package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Main{
  public static void main(String[] args) {
    int[] nums = new int[]{9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9};
    System.out.println(countHillValley(nums));
  }
    public static int countHillValley(int[] nums) {
        
        int hills = 0;
        int valleys = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] <= nums[i + 1]) i++;
                hills++;
            } else if (nums[i] > nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] >= nums[i + 1]) i++;
                valleys++;
            }
            i++;
        }
        return hills + valleys;
    }

}
}