package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        int[] oddRemainList = new int[nums.length];
        int[] evenRemainList = new int[nums.length];
        int oddRemainIndex = 0;
        int evenRemainIndex = 0;
        int oddRemainCount = 0;
        int evenRemainCount = 0;
        int currentRemain = nums[0];
        int oddRemainCount1 = 0;
        int evenRemainCount1 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 1) {
                if (currentRemain == nums[i]) {
                    oddRemainList[oddRemainIndex++] = nums[i];
                    oddRemainCount1++;
                } else if (oddRemainCount1 >= 1) {
                    oddRemainCount1 = 0;
                }
            } else {
                if (currentRemain == nums[i]) {
                    evenRemainList[evenRemainIndex++] = nums[i];
                    evenRemainCount1++;
                } else if (evenRemainCount1 >= 1) {
                    evenRemainCount1 = 0;
                }
                currentRemain = nums[i];
            }
        }
        int oddRemainCount2 = 0;
        int evenRemainCount2 = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (i % 2 == 1) {
                if (currentRemain == nums[i]) {
                    oddRemainList[oddRemainIndex++] = nums[i];
                    oddRemainCount2++;
                } else if (oddRemainCount2 >= 1) {
                    oddRemainCount2 = 0;
                }
            } else {
                if (currentRemain == nums[i]) {
                    evenRemainList[evenRemainIndex++] = nums[i];
                    evenRemainCount2++;
                } else if (evenRemainCount2 >= 1) {
                    evenRemainCount2 = 0;
                }
                currentRemain = nums[i];
            }
        }

        int oddCount1 = 0;
        int evenCount1 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 1) {
                if (oddCount1 > 1) {
                    oddCount1 = 0;
                    oddCount++;
                }
                if (nums[i] == nums[i - 1]) {
                    oddCount1++;
                }
            } else {
                if (evenCount1 > 1) {
                    evenCount1 = 0;
                    evenCount++;
                }
                if (nums[i] == nums[i - 1]) {
                    evenCount1++;
                }               
            }
        }

        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[resultIndex++] = evenList[i];
            } else {
                result[resultIndex++] = oddList[i];
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != result[i]) {
                count++;
            }
        }

        return count;
    }

        
}