package com.codex;

import java.util.*;

public class Solution {
List<Integer> result = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for (int i=1; i<10; ++i) {
            dfs(i, n);
        }
        return result;
    }

    public void dfs(int cur, int n) {
        if (cur > n) return;
        else {
            result.add(cur);
            for (int i=0; i<10; i++) {
                if (10*cur+i>n) return;
                dfs(10*cur+i,n);
            }
        }
        ans.add(0, supply);
    }

    
}