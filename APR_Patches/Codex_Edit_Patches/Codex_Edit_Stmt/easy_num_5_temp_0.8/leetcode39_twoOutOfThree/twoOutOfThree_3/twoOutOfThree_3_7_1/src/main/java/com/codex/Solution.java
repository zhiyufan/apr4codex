package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        
        for (int num : nums1) { //nums1 元素放入集合
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) { //nums2 元素放入集合, 并且nums2 元素在 nums1 集合中存在的, 结果集合中添加元素
            if (set1.contains(num)) { 
                result.add(num);
            }
            set2.add(num);
        }
        for (int num : nums3) {
            if (set1.contains(num) || set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    
}