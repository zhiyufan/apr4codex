package com.codex;

import java.util.*;

public class Solution {
int a = 0;

public static int addRungs(int[] rungs, int dist) {

    if (rungs[0] > dist) {
        return 1;
    }

    int count = 0;
    for (int i = 1; i < rungs.length; i++) {
        if (rungs[i] - rungs[i - 1] > dist) {
            a++;
        }
    }
    return count;
}

public static void main(String[] args) {
    int[] rungs = { 0, 3, 100, 200 };
    addRungs(rungs, 6);
}
}