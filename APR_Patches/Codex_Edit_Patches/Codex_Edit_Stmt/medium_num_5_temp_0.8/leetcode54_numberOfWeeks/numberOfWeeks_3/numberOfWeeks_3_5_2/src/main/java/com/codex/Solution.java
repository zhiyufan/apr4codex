package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
    int temp = 0;
    for (int i = 0; i < milestones.length; i++) {
        for (int j = 1; j < milestones.length - i; j++) {
            if (milestones[j - 1] > milestones[j]) {
                temp = milestones[j - 1];
                milestones[j - 1] = milestones[j];
                milestones[j] = temp;
            }
        }
    }

        long ret = 0;
        for (int i = milestones.length - 1; i >= 0; i--) {
            ret += milestones[i] / (milestones.length - i);
            if (milestones[i] % (milestones.length - i) != 0) ret++;
        }
        return ret;
    }

    
}