package com.codex;

import java.util.*;

public class Solution {
public static int[] oddNumbers(int l, int r) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    
}