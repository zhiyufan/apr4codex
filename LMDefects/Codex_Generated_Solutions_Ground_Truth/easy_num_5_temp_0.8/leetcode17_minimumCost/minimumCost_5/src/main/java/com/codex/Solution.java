package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        /** A shop is selling candies at a discount. For every two candies sold, the shop gives a third candy for free.
         * The customer can choose any candy to take away for free as long as the cost of the chosen candy is less than or equal to the minimum cost of the two candies bought.
         * For example, if there are 4 candies with costs 1, 2, 3, and 4, and the customer buys candies with costs 2 and 3, they can take the candy with cost 1 for free, but not the candy with cost 4.
         * Given a 0-indexed integer array cost, where cost[i] denotes the cost of the ith candy, return the minimum cost of buying all the candies.
         */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : cost) {
            list.add(i);
        }
        Collections.sort(list);
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2) {
                continue;
            }
            res += list.get(cost.length-1-i);
        }
        return res;
    }

    }