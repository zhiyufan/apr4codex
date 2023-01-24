package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        /** There are n projects numbered from 0 to n - 1. You are given an integer array milestones where each milestones[i] denotes the number of milestones the ith project has.
         * You can work on the projects following these two rules:
         * Every week, you will finish exactly one milestone of one project. You must work every week.
         * You cannot work on two milestones from the same project for two consecutive weeks.
         * Once all the milestones of all the projects are finished, or if the only milestones that you can work on will cause you to violate the above rules, you will stop working. Note that you may not be able to finish every project's milestones due to these constraints.
         * Return the maximum number of weeks you would be able to work on the projects without violating the rules mentioned above.
         */
        int left = 0;
        int right = Integer.MAX_VALUE;
        long[] week = new long[milestones.length];
        week[0] = milestones[0];
        for (int i = 1; i < milestones.length; i++) {
            week[i] = week[i - 1] + milestones[i];
        }
        while (left < right) {
            int mid = (left + right) / 2;
            if (isPossible(mid, week))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    }