package com.codex;

import java.util.*;

public class Solution {
int maxTwoEvents(vector<vector<int>>& events) {
    sort(events.begin(), events.end(), [](auto& a, auto& b){return a[1] < b[1];});
    int cur = 0, pre = 0;
    for (auto& e : events) {
        pre = max(pre, cur);
        cur = max(cur, pre + e[2]);
    }

    return max(cur, pre);
}
}