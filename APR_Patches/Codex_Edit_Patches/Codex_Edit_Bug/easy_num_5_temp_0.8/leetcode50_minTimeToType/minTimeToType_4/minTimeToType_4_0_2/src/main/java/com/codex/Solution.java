package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        List<Character> letters = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = letters.indexOf(letter);
            int distance = index - letters.indexOf('a');
            if (distance < 0){
                distance += 26;
            }
            if (distance > 13) {
                counter += Math.min(26 - distance, distance);
            }else{
                counter += distance;
            }
        }


// level order

//     class ListNode {
//     int value = 0;
//     ListNode next;

//     ListNode(int value) {
//         this.value = value;
//     }
// }

// class TreeNode {
//     int value = 0;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int value) {
//         this.value = value;
//     }
// }

static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> newList = new LinkedList<>();
        List<Integer> list = null;
        Queue<TreeNode> queue = new LinkedList<>();
        int nodesInLevel = 1;
        int nodesInNextLevel = 0;
        queue.add(root);
        TreeNode current = null;
        while(!queue.isEmpty()){
            current = queue.remove();
            if(current != null) {
                list.add(current.value);
                nodesInLevel--;
                if(current.left != null) {
                    queue.add(current.left);
                    nodesInNextLevel++;
                }
                if(current.right != null) {
                    queue.add(current.right);
                    nodesInNextLevel++;
                }
            }
            if(nodesInLevel == 0) {
                nodesInLevel = nodesInNextLevel;
                nodesInNextLevel = 0;
                newList.add(list);
                list = new LinkedList<>();
            }
        }
        return newList;
    }
        return counter;
    }
}