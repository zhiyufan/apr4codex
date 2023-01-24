package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public String maximumNumber(String num, int[] change) {
        int[] count = new int[10];
        // 1. count the frequencies of each digit
        for (char ch : num.toCharArray()) {
            count[ch - '0']++;
        }
        // 2. For each digit i, find all the possible pairs of (count[i], change[j])
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < change.length; j++) {
                int key = Math.min(change[j], count[i]);
                int val = i;
                map.put(key, Math.max(map.getOrDefault(key, 0), val));
            }
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