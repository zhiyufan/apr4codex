package com.codex;

import java.util.*;

public class Solution {
public int maxDepth(Node root) {
        if (root == null) return 0;
        int d = 0;
        for (Node n : root.children)
            d = Math.max(d, maxDepth(n));
        return d + 1;
    }
}