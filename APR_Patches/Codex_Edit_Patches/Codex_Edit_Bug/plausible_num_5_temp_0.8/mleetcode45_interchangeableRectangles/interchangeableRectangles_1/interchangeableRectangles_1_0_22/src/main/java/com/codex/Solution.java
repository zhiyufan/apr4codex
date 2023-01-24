package com.codex;

import java.util.*;

public class Solution {
    public class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            for (int i : A){
                sum += i;
                set.add(i);
            }
        }
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }
}