package com.codex;

import java.util.*;

public class Solution {
//Given the length of an array changed, the elements which were removed from the original array and added to the changed array were all even integers.
//Return the original array. If it doesn't exist, return an empty array.

    //Example 1:
    //Input: int[] changed = [1,3,3,2,2]
    //Output: [2,2,3,3,1]

//Constraints:
//The length of the given array is in the range [1, 50000].

//Solution:

    public static int[] findOriginalArray(int[] changed) {
        
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> cache = new HashMap<>();
        int[] res = new int[changed.length / 2];

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];
            int count = cache.getOrDefault(num, 0);
            cache.put(num, count + 1);
        }

        int index = 0;
        for (int k : cache.keySet()) {
            int v = cache.get(k);
            if (v % 2 != 0) {
                return new int[0];
            }
            for (int i = 0; i < v / 2; i++) {
                res[index] = k;
                index++;
            }
        }
        return res;
    }

    
}