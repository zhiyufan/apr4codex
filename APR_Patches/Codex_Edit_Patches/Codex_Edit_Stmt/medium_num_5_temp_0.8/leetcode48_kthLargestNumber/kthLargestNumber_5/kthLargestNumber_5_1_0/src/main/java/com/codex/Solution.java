package com.codex;

import java.util.*;

public class Solution {
    public boolean isValidBST(TreeNode root) {
		return dfs(root, null, null);
	}
}