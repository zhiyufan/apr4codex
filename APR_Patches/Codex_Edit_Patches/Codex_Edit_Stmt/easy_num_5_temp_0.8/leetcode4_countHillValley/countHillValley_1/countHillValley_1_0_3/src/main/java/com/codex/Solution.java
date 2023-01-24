package com.codex;

import java.util.*;

public class Solution {
//The code should be written in Java
//The code should output to the console the number of required valley-hill-valley (VHV) sequences
//A VHV sequence is defined as a sequence of numbers that starts with a valley (a number lower than the number on its left), followed by a hill (a number higher than the number on its left) and ends with a valley (a number lower than the number on its left)
//A valley is defined as a number lower than the number on its left
//A hill is defined as a number higher than the number on its left
//The input code will be provided by the company
//You should write the code to output the total number of VHV sequences in that input
//Example:
//Input: [4, 5, 2, 3, 2, 1, 2, 3, 3, 4, 2]
//Output: 3
//
//Input: [4, 4, 3, 3, 2, 1, 2, 3, 3, 4, 4]
//Output: 0
//Input: [4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4]
//Output: 0
//Write your code here
//


public static int countHillValley(int[] numbers) {
    int result = 0, lastValue = 0, i = 0;
    while (i < numbers.length) {
        if (i + 1 > numbers.length - 1) break;
        if (numbers[i] > numbers[i + 1]) lastValue = i;
        if (lastValue > 0 && numbers[i] < numbers[i + 1]) {
            result++;
            lastValue = 0;
        }
        i++;
    }

    return result;
}


//  public static int countHillValley(int[] nums) {
//
//      if (nums == null || nums.length < 3) return 0;
//      int count = 0;
//      for (int i = 1; i < nums.length - 1; i++) {
//          if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
//          if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
//      }
//      return count;
//  }
}