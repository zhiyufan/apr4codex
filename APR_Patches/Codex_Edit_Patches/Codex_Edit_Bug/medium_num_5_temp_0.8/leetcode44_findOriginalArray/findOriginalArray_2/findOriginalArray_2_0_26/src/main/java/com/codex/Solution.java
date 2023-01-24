package com.codex;

import java.util.*;

public class Solution {
    
public static int[] findOriginalArray(int[] changed) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] ret = new int[changed.length / 2];

        if (changed != null && changed.length > 0) {
            for (int num : changed) {
                if (map.containsKey(num)) {
                    map.remove(num);
                } else {
                    map.put(num, 1);
                }
            }
        }

        if (map.size() == 0) {
            int index = 0;
            for (int num : changed) {
                ret[index++] = num;
            }
            return ret;
        } else {
            //modify
            return new int[0];
        }
    }
    public static int[] findOriginalArray(int[] changed) {
        int[] ret = new int[changed.length / 2];

        if (changed != null && changed.length > 0) {
            int index = 0;
            List<Integer> list = new ArrayList<Integer>();
            for (int num : changed) {
                if (list.contains(num)) {
                    list.remove(new Integer(num));
                } else {
                    list.add(num);
                }
            }
            if (list.size() == 0) {
                for (int num : changed) {
                    ret[index++] = num;
                }
                return ret;
            } else {
                //modify
                return new int[0];
            }
        }
        return null;
    }
}