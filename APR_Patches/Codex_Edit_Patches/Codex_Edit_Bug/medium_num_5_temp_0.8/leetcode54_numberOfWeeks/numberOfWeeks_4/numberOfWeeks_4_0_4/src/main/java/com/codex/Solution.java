package com.codex;

import java.util.*;

public class Solution {
void

int main() {
    int n, k;
    scanf("%d%d", &n, &k);
    int x[n];
    int max = INT_MIN;
    for (int i = 0; i < n; i++) {
        scanf("%d", &x[i]);
        max = std::max(max, x[i]);
    }
    for (int i = 0; i < n; i++) {
        if (x[i] + k > max) {
            printf("%d\n", x[i] + k);
            return 0;
        }
    }
    return 0;
}
}