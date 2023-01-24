package com.codex;

import java.util.*;

public class Solution {
import java.util.Map;
import java.util.HashMap;
public class MajorityElement {

    public static int getMajorityElement(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for(Integer val : map.keySet()) {
            Integer count = map.get(val);
            if(count > a.length / 2) return 1;
        }
        return -1;
    }
}
}