package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class NumberOccurance{

	Map<Integer, Integer> occurance;

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