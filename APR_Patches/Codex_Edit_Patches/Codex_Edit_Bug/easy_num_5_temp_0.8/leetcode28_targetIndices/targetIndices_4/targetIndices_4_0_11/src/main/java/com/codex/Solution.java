package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class TargetIndices {
    public static void main(String[] args) {
        List<Integer> result = targetIndices(new int[]{1, 2, 3, 4}, 3);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<Integer> targetIndices(int[] numbers, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                result.add(i);
            }
        }
        return result;
    }
}

//    public static List<Integer> targetIndices(int[] nums, int target) {
        

//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                result.add(i);
//            }
//        }
//        return result;
//    }

    
}