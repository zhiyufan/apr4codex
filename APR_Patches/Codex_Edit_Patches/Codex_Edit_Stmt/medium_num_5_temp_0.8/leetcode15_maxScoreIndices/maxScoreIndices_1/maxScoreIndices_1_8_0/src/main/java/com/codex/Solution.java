package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> fibs = new ArrayList();
        fibs.add(1);
        fibs.add(1);
        int i = 2;
        while (fibs.get(i-1) <= k) {
            fibs.add(fibs.get(i-1) + fibs.get(i-2));
            i++;
        }
        int count = 0;
        while (k > 0) {
            int index = Collections.binarySearch(fibs, k);
            if (index < 0)
                index = -index - 2;
            k -= fibs.get(index);
            count++;
        }
        return count;
    }
}
}