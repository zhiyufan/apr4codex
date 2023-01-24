package com.codex;

import java.util.*;

public class Solution {
public static long minimalKSum(int[] nums, int k) {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int num : nums) {
        pq.add(num);
    }

    for(int i = pq.peek() + 1; i <= k; i++) {
        pq.add(i);
    }
    long sum = 0;
    while(!pq.isEmpty()) {
        sum += pq.poll();
    }
    return sum;
}
}