package com.codex;

import java.util.*;

public class Solution {
    public static List<String> LargestValues(TreeNode root) {
        List<String> res = new ArrayList<>(); 
        dfs(res,0,root);
        return res; 
    }

    private static void dfs(List<String> res, int level, TreeNode node){
        if (node == null) return;
        if (res.size() == level) res.add(node.val);
        else if (res.get(level).compareTo(node.val) < 0) res.set(level, node.val);
        dfs(res,level+1,node.left);
        dfs(res,level+1,node.right);
    }
}