package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxProfit(int[] A) {
        int sell1 = 0, sell2 = 0, buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            buy1 = Math.max(buy1, -A[i]);
            sell1 = Math.max(sell1, buy1 + A[i]);
            buy2 = Math.max(buy2, sell1 - A[i]);
            sell2 = Math.max(sell2, buy2 + A[i]);
        }
        return sell2;
    }}
}