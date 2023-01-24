package com.codex;

import java.util.*;

public class Solution {
for (int i = 0; i < rungs.length; i++) {
    if (rungs[i] > max) {
        if (rungs[i] - max > dist) {
            count++;
            max = max + dist;
        } else if (rungs[i] - max <= dist) {
            max = rungs[i];
        }
    }

}
}