package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfNodes(BinaryTreeNode<String> root){
        int count = 1;
        if(root.left != null) count += numberOfNodes(root.left);
        if(root.right != null) count += numberOfNodes(root.right);
        return count;
    }
    public static int numberOfLeafNodes(BinaryTreeNode<String> root){
        int count = 0;
        if(root.left == null && root.right == null) return 1;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
        }
        int seconds = 0;
        while(!queue.isEmpty()){
            int person = queue.remove();
            if(person == 0) continue;
            if(k == 0) {
                seconds += person;
                queue.add(person);
                k = queue.size() - 1;
            }
            else{
                queue.add(person - 1);
                seconds++;
                k--;
            }
        }
        return seconds;
    }

    
}