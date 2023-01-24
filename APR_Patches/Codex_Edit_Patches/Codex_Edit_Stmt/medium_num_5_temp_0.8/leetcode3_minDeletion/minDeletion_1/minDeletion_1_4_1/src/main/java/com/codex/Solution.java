package com.codex;

import java.util.*;

public class Solution {
public static int minDeletion(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length-1; i++) {
        if (nums[i] % 2 == 0) { //数组的偶数拆两个， 相同的计数增加， 不同的计数增加
            if (nums[i] == nums[i+1])
                count++;
        } else { //数组的奇数拆一个， 相邻的两个值不一样的计数增加
            if (nums[i] != nums[i+1])
                count++;
        }
    }
    return count;
}
}