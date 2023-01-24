package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        int[] oddList = new int[nums.length];
        int[] evenList = new int[nums.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) { // 偶数
                evenList[i / 2] = nums[i];
                evenList[i / 2 + 1] = nums[i + 1];
            } else { // 奇数
                oddList[i / 2] = nums[i];
                oddList[i / 2 + 1] = nums[i + 1];
            }
        }

        int oddCount = 0;
        int evenCount = 0;

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