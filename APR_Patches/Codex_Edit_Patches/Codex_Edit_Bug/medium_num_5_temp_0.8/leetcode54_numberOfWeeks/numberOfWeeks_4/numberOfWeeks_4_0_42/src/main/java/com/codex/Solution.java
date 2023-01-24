package com.codex;

import java.util.*;

public class Solution {
private static class Pair {
        private long count;
        private long includedWeek;

        public Pair(long count, long includedWeek) {
            this.count = count;
            this.includedWeek = includedWeek;
        }

        public long getCount() {
            return count;
        }

        public long getIncludedWeek() {
            return includedWeek;
        }
    }

    public static long numberOfWeeks(int[] milestones) {

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < milestones.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                if (milestones[j] % milestones[i] == 0) {
                    list.get(i).add(j);
                }
            }
        }
        Pair[] dp = new Pair[milestones.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = new Pair(milestones[i], milestones[i] / 7);
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                for(int k : list.get(i)) {
                    if(k == j) {
                        continue;
                    }
                    Pair p1 = dp[i];
                    Pair p2 = dp[j];
                    long count = p1.getCount() + milestones[j];
                    long includedWeek = p1.getIncludedWeek() + milestones[j] / 7;
                    if (count > p2.getCount()) {
                        dp[j] = new Pair(count, includedWeek);
                    } else if (count == p2.getCount() && includedWeek > p2.getIncludedWeek()) {
                        dp[j] = new Pair(count, includedWeek);
                    }
                }
            }
        }
        Pair max = new Pair(Long.MIN_VALUE, Long.MIN_VALUE);
        for (int i = 0; i < dp.length; i++) {
            if (max.getCount() < dp[i].getCount()) {
                max = dp[i];
            } else if (max.getCount() == dp[i].getCount() && max.getIncludedWeek() < dp[i].getIncludedWeek()) {
                max = dp[i];
            }
        }
        return max.getIncludedWeek();
    }
}