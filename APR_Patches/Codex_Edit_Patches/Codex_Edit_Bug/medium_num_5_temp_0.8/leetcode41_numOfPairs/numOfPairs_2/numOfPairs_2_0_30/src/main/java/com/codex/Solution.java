package com.codex;

import java.util.*;

public class Solution {
public static int numOfPairs(String[] nums, String target) {

//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (j != i) {
//                    if ((nums[i] + nums[j]).equals(target)) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count / 2;

    int count = 0;
    for (int i = 0; i < nums.length-1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (!nums[i].equals(nums[j])) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                    for (int k = 0; k < nums.length; k++) {
                        if (k != i && k != j) {
                            if ((nums[k] + nums[i]).equals(target) || (nums[k] + nums[j]).equals(target)) {
                                count--;
                            }
                        }
                    }
                }
            }
        }
    }

    return count;
}
}