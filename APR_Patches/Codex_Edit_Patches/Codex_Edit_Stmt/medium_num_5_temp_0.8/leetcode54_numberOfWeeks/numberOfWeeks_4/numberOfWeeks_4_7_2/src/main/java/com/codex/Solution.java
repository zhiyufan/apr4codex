package com.codex;

import java.util.*;

public class Solution {
package test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public long numberOfWeeks(int[] milestones) {
        List<List<Integer>> dependency = new ArrayList<>();
        for (int i = 0; i < milestones.length; i++) {
            dependency.add(new ArrayList<>());
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                if (milestones[j] % milestones[i] == 0) {
                    dependency.get(i).add(j);
                }
            }
        }
        for (int i = 0; i < milestones.length; i++) {
            List<Integer> dependent = dependency.get(i);
            for (int d : dependent) {
                milestones[d] = Math.max(milestones[d], milestones[i] + milestones[d]);
            }
        }
        int max = 0;
        for (int m : milestones) {
            max = Math.max(max, m);
        }    
        return (max - 1) / 7 + 1;    
    }
}
}