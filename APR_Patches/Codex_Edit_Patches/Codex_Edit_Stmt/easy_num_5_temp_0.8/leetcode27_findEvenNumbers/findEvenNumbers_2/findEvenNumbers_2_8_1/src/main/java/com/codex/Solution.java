package com.codex;

import java.util.*;

public class Solution {
	public static int[] findEvenNumbers(int[] digits) {
        
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < digits.length-2; i++) {
            for (int j = i+1; j < digits.length-1; j++) {
                for (int k = j+1; k < digits.length; k++) {
                    if((digits[i]*100+digits[j]*10+digits[k]) %2 == 0)
                        evenList.add(digits[i]*100+digits[j]*10+digits[k]);
                }
            }
        }
        Collections.sort(evenList);
        return evenList.stream().mapToInt(Integer::intValue).toArray();
    }

    
}