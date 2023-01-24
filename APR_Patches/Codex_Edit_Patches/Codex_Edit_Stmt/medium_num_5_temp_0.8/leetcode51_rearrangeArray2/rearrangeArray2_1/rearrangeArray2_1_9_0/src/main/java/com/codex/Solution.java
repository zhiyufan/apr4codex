package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 1; i < n-1; i++) {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }

        average[0] = (nums[0] + nums[1])/2;
        average[n-1] = (nums[n-2] + nums[n-1])/2;

        Arrays.sort(nums);
        Arrays.sort(average);

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] >= average[i]) {
                answer[i] = nums[i-1];
            } else {
                answer[i] = nums[i];
            }
        }

    
def rearrangeArray2(nums):
    n = len(nums)
    average = [0]*n

    for i in range(1, n-1):
        average[i] = (nums[i-1] + nums[i+1])/2
    print(average)

    average[0] = (nums[0] + nums[1])/2
    average[n-1] = (nums[n-2] + nums[n-1])/2

    nums = sorted(nums)
    average = sorted(average)
    print(nums, average)
    answer = [0]*n

    for i in range(n):
        if nums[i] >= average[i]:
            answer[i] = nums[i-1]
        else:
            answer[i] = nums[i]

    return answer

if __name__ == "__main__":
    nums = [1,0,2,4,3,9,7,0,0,0]
    print(rearrangeArray2(nums))
        return answer;
    }
}