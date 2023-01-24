package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;
import java.util.Map;

public class maximumNumberOfUniqueIntegers {

    public static int maxNumberOfUniqueIntegers(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : arr) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < change.length; i++) {
            count_change[change[i]]++;
        }
        for (int i = 9; i >= 0; i--) {
            while (count_change[i] > 0 && count_num[i] > 0) {
                changed.append(i);
                count_num[i]--;
                count_change[i]--;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = count_num[i]; j > 0; j--) {
                number.append(i);
            }
        }
        return changed.length() > 0 ? changed.toString() : number.toString();
    }

    
}