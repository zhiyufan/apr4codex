package com.codex;

import java.util.*;

public class Solution {
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                int temp = n % 10;
                sum += (temp * temp);
                n = n / 10;
            }
            if (visited.contains(sum)) {
                return false;
            }
            visited.add(sum);
            n = sum;
        }
        
        return true;
        
    }

}
}