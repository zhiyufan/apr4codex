package com.codex;

import java.util.*;

public class Solution {
int find(int n, int d) {
    int count = 0;
    int i = n;
    while (i >= 0 && i >= d) {
        count++;
        i -= d;
    }

    return count;
}
}