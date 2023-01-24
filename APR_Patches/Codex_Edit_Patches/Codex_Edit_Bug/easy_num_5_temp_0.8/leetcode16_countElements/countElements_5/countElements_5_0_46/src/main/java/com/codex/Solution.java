package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {


        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length-2; j++) {
                if ((nums[j] == nums[i] + 1) && (i != j)) {
                    result++;
                    count++;
                    if(count>1){
                        break;
                    }
                }
            }
        }
        return result;
    }
}