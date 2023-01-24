package com.codex;

import java.util.*;

public class Solution {
    List<Integer> result = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            int val1 = candidates[i];
            for (int j = 0; j < candidates.length; j++) {
                int val2 = candidates[j];
                if(val2 == val1)
                    continue;
                for (int k = 0; k < candidates.length; k++) {
                    int val3 = candidates[k];
                    if(val3 == val1 || val3 == val2)
                        continue;
                    int num1 = Integer.parseInt(String.valueOf(val1)+String.valueOf(val2));
                    int num2 = Integer.parseInt(String.valueOf(val1)+String.valueOf(val3));
                    int num3 = Integer.parseInt(String.valueOf(val2)+String.valueOf(val3));
                    if(num1 + num2 == num3){
                        List<Integer> t = new ArrayList<>();
                        t.add(num1);
                        t.add(num2);
                        t.add(num3);
                        Collections.sort(t);
                        if(!result.contains(t))
                            result.add(num3);
                    }
                }
            }
        }	
        Collections.sort(result);
        
        return result.stream().mapToInt(i -> i).toArray();
        int[] candidates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    
}