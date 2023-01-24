package com.codex;

import java.util.*;

public class Solution {
double check(double x, int t, int a, int b, vector<int> &c, vector<int> &d) {
    // x time need to reach star a, if time is t, then we can reach at most x*t star from a
    double reachable = x * t;
    // count how many stars can be reach from a
    double res = 0;
    for (int j = 0; j < c.size(); j++) {
        if (abs(c[j] - a) + abs(d[j] - b) <= reachable) res += 1;
    }
    return res;
}
class Solution {
public:
    double getMaxDist(vector<int>& a, vector<int>& b, vector<int>& c, vector<int>& d, int t) {
        double l1 = 0, l2 = 1e15;
        // binary search on time needed to reach star a
        for (int i = 0; i < 50; i++) {
            double mid = (l1 + l2) / 2;
            // if we can get more stars, then we need more time to reach star a
            if (check(mid, t, a[0], b[0], c, d) < check(mid + 0.1, t, a[0], b[0], c, d)) l1 = mid;
            else l2 = mid;
        }
        double ans = 0;
        // try every star, and get the maximum number of reachable stars
        for (int i = 0; i < a.size(); i++) {
            ans = max(ans, check((l1 + l2) / 2, t, a[i], b[i], c, d));
        }
        return ans;
    }
};
}