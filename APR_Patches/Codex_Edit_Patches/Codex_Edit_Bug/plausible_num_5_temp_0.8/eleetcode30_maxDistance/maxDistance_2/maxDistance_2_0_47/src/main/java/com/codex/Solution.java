package com.codex;

import java.util.*;

public class Solution {
package com.interview;
import java.util.*;

public class MaxDistance {
    public int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(colors[i])){
                map.put(colors[i], i);
            }else{
                int prev = map.get(colors[i]);
                maxDist = Math.max(maxDist, i - prev);
                map.put(colors[i], i);
            }
        }
        return maxDist;
    }

    
}