package com.codex;

import java.util.*;

public class Solution {

    int largestRectangleArea(vector<int>& height) {
       int n = height.size();
        int i = 0;
        stack<int> s;
        int maxArea = 0;
        vector<int> h = height;
        h.push_back(0);
        while(i < h.size()) {
            if(s.empty() || h[s.top()] <= h[i]) {
                s.push(i++);
            } else {
                int t = s.top();
                s.pop();
                maxArea = max(maxArea, h[t] * (s.empty() ? i : i - s.top() - 1));
            }     
        }
        return maxArea;
    }

    
}