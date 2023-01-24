package com.codex;

import java.util.*;

public class Solution {
    import java.util.ArrayList;
    import java.util.List;
    
    public class SampleFile {
    
    public static List<Integer> targetIndices(int[] nums, int target) {
        

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }
    }
}