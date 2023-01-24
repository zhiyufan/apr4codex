package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;

public class Solution {
    public static int[] findOriginalArray(int[] arr) {
        if (arr.length % 2 != 0) {
            return new int[0]; 
        } 

        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i: arr) {
            int count = map.getOrDefault(i, 0);
            map.put(i, count + 1);
        }

        int[] res = new int[arr.length / 2];
        int index = 0; 
        for (int k: map.keySet()) {
            int v = map.get(k);
            if (v % 2 != 0) {return new int[0];} 
            for (int i = 0; i < v / 2; i++) { 
                res[index] = k; index++;
            } 
        }
        return res; 
    }

}
}