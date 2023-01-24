package com.codex;

import java.util.*;

public class Solution {
 /* 
    1. Convert array to list 
    2. Sort the list
    3. Iterate over the list in reverse order
    4. At each iteration check if the index is a multiple of 3 and if so skip it
    5. If not then add it to the result var
    6. Return result
 */
    public static int minimumCost(int[] cost) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : cost) {
            list.add(i);
        }
        Collections.sort(list);
        int res = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 3 == 2) {
                continue;
            }
            res += list.get(i);
        }
        return res;
    }

    
}