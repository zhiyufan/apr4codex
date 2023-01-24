package com.codex;

import java.util.*;

public class Solution {
public static int minStoneSum(int[] piles, int k) {
        

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int pile : piles) pq.offer(pile);
    for (; k > 0; k--)
        pq.offer(pq.poll() / 2);
    int sum = 0;
    while (!pq.isEmpty()) sum += pq.poll();
    return sum;
}
}