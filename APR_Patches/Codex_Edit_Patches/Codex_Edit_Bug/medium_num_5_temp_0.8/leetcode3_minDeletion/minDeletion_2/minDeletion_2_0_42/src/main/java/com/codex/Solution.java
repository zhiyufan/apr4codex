package com.codex;

import java.util.*;

public class Solution {
public static int minDeletion(int[] nums) {



    int oddIndex = 0;
    int evenIndex = 0;
    for (int i = 0; i < nums.length; i++) {
        if (i % 2 == 0) {
            evenList[evenIndex++] = nums[i];
        } else {
            oddList[oddIndex++] = nums[i];
        }
    }

    int oddCount = 0;
    int evenCount = 0;
    for (int i = 0; i < evenList.length; i++) {
        if (evenCount > 1) {
            evenList[i - 1] = evenList[i];
        }
        evenCount = 0;
        if (i > 0 && evenList[i] == evenList[i - 1]) {
            evenCount++;
        }
    }

    for (int i = 0; i < oddList.length; i++) {
        if (oddCount > 1) {
            oddList[i - 1] = oddList[i];
        }
        oddCount = 0;
        if (i > 0 && oddList[i] == oddList[i - 1]) {
            oddCount++;
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

int[] nums = {1, 4, 2, 1, 2, 4};

for (int i = 0; i < nums.length; i++) {
    System.out.print(nums[i] + " ");
}
System.out.println();
int res = minDeletion(nums);
System.out.println(res);

String s = "BGGBG";
int[][] dp = new int[s.length()][s.length()];


for (int i = 0; i < s.length(); i++) {
    dp[i][i] = 1;
}


for (int i = 1; i < s.length(); i++) {
    for (int j = i - 1; j >= 0; j--) {
        int e = i;
        int s = j;
        int count = 0;
        while (s < e) {
            if (s + 1 <= e - 1 && s + 2 <= e) {
                if (dp[s + 2][e] > 0) {
                    count++;
                }
            }
            s++;
        } 
        dp[j][i] = count;
    }
}

System.out.println(dp[0][dp[0].length - 1]);
}