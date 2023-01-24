package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.util.stream.Collectors;

public List<Integer> sumOfThree(int num) {
        
        List<Integer> result = new ArrayList<>();
        if (num < 3) {
            return new ArrayList<>();
        }
        int low = 1;
        int high = 2;

        int sum = 3;

        while (high < num) {
            if (sum < num) {
                high++;
                sum += high;
            } else if (sum > num) {
                sum -= low;
                low++;
            } else {
                for (int i = low; i <= high; i++) {
                    result.add(i);
                }
                break;
            }
        }

        return result;
    }

    
}