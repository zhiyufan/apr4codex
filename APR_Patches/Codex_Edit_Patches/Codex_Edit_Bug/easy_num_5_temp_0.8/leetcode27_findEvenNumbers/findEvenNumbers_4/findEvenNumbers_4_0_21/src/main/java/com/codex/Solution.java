package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> evenNumbers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(Arrays.stream(digits).anyMatch(m->m==i) && Arrays.stream(digits).anyMatch(m->m==j) && Arrays.stream(digits).anyMatch(m->m==k)) {
                        if ((100 * i + 10 * j + k) % 2 == 0) {
                            evenNumbers.add(100 * i + 10 * j + k);
                        }
                    }
                }
            }
        }
        int[] result = evenNumbers.stream().mapToInt(i->i).toArray();
        Arrays.sort(result);
        return result;
    }

    
}