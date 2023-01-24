package com.codex;

import java.util.*;

public class Solution {
#include <iostream>
#include <string.h>

#define MAX_N 1250010

using namespace std;

int N, P, L;
int dp[MAX_N], inv[MAX_N], cut[MAX_N], len[MAX_N];
char str[MAX_N];

void build() {
    for (int i = 0; i < N; ++i) dp[i] = str[i] == '1';
    for (int i = 0; i < N; ++i) inv[i] = str[N - i - 1] != '1';
    for (int i = N - 2; i >= 0; --i)
        inv[i] += inv[i + 1];
    for (int i = 0; i < N; ++i)
        dp[i] = max(dp[i], inv[i]);
    for (int i = N - 2; i >= 0; --i)
        dp[i] = max(dp[i], dp[i + 1] + (str[i] == '1'));
    for (int i = 0; i < N; ++i)
        cut[i] = (str[i] == '1' && str[i - 1] == '0');
    for (int i = 1; i < N; ++i)
        cut[i] += cut[i - 1];

    for (int i = 0; i < N; ++i) {
        int l = 0, r = i;
        while (l < r) {
            int mid = (l + r) / 2;
            if (cut[i] - cut[mid - 1] <= L)
                r = mid;
            else
                l = mid + 1;
        }
        for (int len = 3; len <= s.length(); len++) {
            for (int i = 0; i < s.length() - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i][j] + 1 + dp[i + 1][j - 1];
                    if (len == 3) dp[i][j] = dp[i][j] - 1;
                }
            }
        }
        return dp[0][s.length() - 1];
    }
    
}