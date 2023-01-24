package com.codex;

import java.util.*;

public class Solution {

//TODO:
//    Программа определяет количество чисел, в массиве nums, которые заданы по одному описанному ниже правилу.

    public static int countElements(int[] nums) {
        

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] == nums[i] + 1) && (i != j)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}