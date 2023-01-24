package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        int[] security = new int[] {100, 100, 100, 100, 100, 100, 100};
        int time = 3;

        List<Integer> res = new ArrayList<>();
        TreeMap<Integer, Integer> range = new TreeMap<Integer, Integer>();
        range.put(0, 0);
        range.put(security.length, 0);
        for (int i = 0; i < time; i++) {
            int min = i == 0 ? Integer.MAX_VALUE : range.floorEntry(i).getValue();
            int max = i == 0 ? Integer.MIN_VALUE : range.floorEntry(i).getValue();
            if (security[i] > max) {
                max = security[i];
            }
            if (security[i] < min) {
                min = security[i];
            }
            range.put(i, min);
            range.put(i, max);
        }
        for (int i = time; i < security.length - time; i++) {
            int min = range.floorEntry(i).getValue();
            int max = range.floorEntry(i).getValue();
            if (security[i] > max) {
                max = security[i];
            }
            if (security[i] < min) {
                min = security[i];
            }
            range.put(i, min);
            range.put(i, max);
            if (security[i - time] <= min && max >= security[i]) {
                res.add(i);
            }
        }
        for (int i = security.length - time; i < security.length; i++) {
            int min = range.floorEntry(i).getValue();
            int max = range.floorEntry(i).getValue();
            if (security[i] > max) {
                max = security[i];
            }
            if (security[i] < min) {
                min = security[i];
            }
            range.put(i, min);
            range.put(i, max);
        }
        return res;
    }

    
}