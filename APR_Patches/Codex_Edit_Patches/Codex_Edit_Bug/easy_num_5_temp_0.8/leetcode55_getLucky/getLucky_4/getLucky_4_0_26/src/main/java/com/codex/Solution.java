package com.codex;

import java.util.*;

public class Solution {
   public class Solution {
    public int[] findMode(TreeNode root) {
        int [] modeValues = new int[0];
        if(root == null) return modeValues;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        int prev = -1;
        int count = 0;
        int maxCount = 0;
        List<Integer> modeList = new ArrayList<>();
        

        while(!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                if(prev == current.val){
                    count ++;
                } else {
                    count = 1;
                }
                if(count >= maxCount){
                    if(count > maxCount){
                        modeList.clear();
                    }
                    modeList.add(current.val);
                    maxCount = count;
                }
                prev = current.val;
                current = current.right;
            }
        }

        while (k > 0) {
            int temp = 0;
            while (ans > 0) {
                temp += ans % 10;
                ans /= 10;
            }
            ans = temp;
            k--;
        }
        return ans;
    }
}