package com.codex;

import java.util.*;

public class Solution {
int[] upper_score(int n, string row) {
    int[] score = new int[n];
    for (int i = 0; i < n; i++) {
        if (row[i] == 'o') {
            score[i] = 0;
        } else {
            score[i] = 1;
        }
    }
    score[0] = 0;
    return score;
}
}