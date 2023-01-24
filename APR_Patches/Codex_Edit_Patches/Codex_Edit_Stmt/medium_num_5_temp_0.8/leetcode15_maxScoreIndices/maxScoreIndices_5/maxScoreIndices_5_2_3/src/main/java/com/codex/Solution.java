package com.codex;

import java.util.*;

public class Solution {
int max = 0;
int maxIndex = -1;
int maxScore = 0;
for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
        max++;
    }
    if (maxScore < max) {
        maxScore = max;
        maxIndex = i;
    }
}
for (int i = 0; i < nums.length; i++) {
    int zerosLeft = i - maxIndex;
    int onesRight = max - zerosLeft;
    if (onesRight - zerosLeft == maxScore) {
        result.add(i);
    }
}

return result;
}