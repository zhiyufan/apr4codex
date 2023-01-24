package com.codex;

import java.util.*;

public class Solution {
public static int[] findOriginalArray(int[] changed) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < changed.length; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
        }

        return map.keySet().stream().flatMapToInt(num -> IntStream.of(num, num)).toArray();
    }


}