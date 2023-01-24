package com.codex;

import java.util.*;

public class Solution {
public class MinSteps {
    public static int minSteps(int target, int maxDoubles) {
        int runningSum = 0;
        int steps = 0;
        while (runningSum < target) {
            runningSum += (runningSum + 1 < target && maxDoubles > 0) ? runningSum + 1 : 1;
            steps++;
            maxDoubles = (runningSum + 1 < target && maxDoubles > 0) ? maxDoubles - 1 : maxDoubles;
        }
        return steps;
    }

}
}