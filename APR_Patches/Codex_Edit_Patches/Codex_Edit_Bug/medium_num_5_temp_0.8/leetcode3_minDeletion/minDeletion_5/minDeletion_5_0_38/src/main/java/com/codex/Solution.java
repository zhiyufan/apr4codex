package com.codex;

import java.util.*;

public class Solution {

int[] nums = {4,3,4,4,4,2};
int length = nums.length;
int count = 0;
for (int i = 0; i < length - 1; i++) {
    if (i % 2 == 0 && nums[i] == nums[i + 1]) {
        count++;
    }
}
return count;


    
}