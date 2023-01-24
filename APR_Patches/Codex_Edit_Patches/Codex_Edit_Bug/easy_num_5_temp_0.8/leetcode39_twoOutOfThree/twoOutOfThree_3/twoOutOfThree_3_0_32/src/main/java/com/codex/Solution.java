package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

    List<Integer> result = new ArrayList<>();
    Set<Integer> set1 = new HashSet<>();
    for (int num : nums1) {
        set1.add(num);
    }

    Set<Integer> set2 = new HashSet<>();
    for (int num : nums2) {
        set2.add(num);
    }
    for (int num : nums3) {
        result.add(num);
    }
    Set<Integer> tmp = new HashSet<>(result);
    tmp.retainAll(set1);
    tmp.retainAll(set2);
    result = new ArrayList<>(tmp);
    return result;
}
}