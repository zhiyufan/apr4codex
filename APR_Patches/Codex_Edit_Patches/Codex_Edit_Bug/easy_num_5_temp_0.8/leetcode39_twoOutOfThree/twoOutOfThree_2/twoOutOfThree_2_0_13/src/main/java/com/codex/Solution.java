package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class TwoOutOfThree {


    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){
        

        List list = new ArrayList();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
                map.put(i, 1);
            }
        }
        for (int i : nums2) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        for (int j : nums3) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            }else {
                map.put(j, 1);
            }
        }
        return list;
    }

    
}