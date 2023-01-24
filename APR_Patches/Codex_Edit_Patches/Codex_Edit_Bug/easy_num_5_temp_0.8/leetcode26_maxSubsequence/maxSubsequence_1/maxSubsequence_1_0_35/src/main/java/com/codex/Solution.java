package com.codex;

import java.util.*;

public class Solution {
    static class Node {
        public char val;
        public Node next;
        public Node(char val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean check(Node head) {
        Stack<Character> stack = new Stack<>();
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.val == '(' || cur.val == '{' || cur.val == '[') {
                stack.push(cur.val);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if (top == '(' && cur.val != ')' ||
                        top == '{' && cur.val != '}' ||
                        top == '[' && cur.val != ']') {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static boolean check1(Node head) {
        while (head != null) {
            if (head.val == ')' || head.val == '}' || head.val == ']') {
                return false;
            }
            if (head.val == '(' || head.val == '{' || head.val == '[') {
                Node cur = head.next;
                int count = 1;
                for(;cur != null && count != 0; cur= cur.next) {
                    if (cur.val == '(' || cur.val == '{' || cur.val == '[') {
                        count++;
                    } else if (cur.val == ')' || cur.val == '}' || cur.val == ']') {
                        count--;
                    }
                }
                if (count != 0) {
                    return false;
                }
                head = cur;
            } else {
                head = head.next;
            }
        }
        return true;
    }

    public static int getIndex(String pattern) {
        int count = 0;
        int i = pattern.length() - 1;
        while (i >= 0 && pattern.charAt(i) == ']') {
            count++;
            i--;
        }
        return count;
    }

    public static boolean isValid(String pattern) {
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '[' || pattern.charAt(i) == '{' || pattern.charAt(i) == '(') {
                return false;
            }
        }
        return true;
    }
    // pattern = "(())"
    // (),(()),((())),(((()))),....
    public static void generateParenthesis(String pattern, int n) {
        if (n == 0) {
            if (!isValid(pattern)) {
                return;
            }
             System.out.println(pattern);
        }
        int index = getIndex(pattern);
        char ch = (char)('A' + index);
        generateParenthesis(pattern + "(" + ch + ")", n - 1);
        generateParenthesis(pattern + ch , n);
    }

    public static int[] maxSubsequence(int[] nums, int k, int index) {
        if (index == nums.length) {
            if (k == 0) {
                return new int[0];
            }
            return null;
        }
        int[] res = maxSubsequence(nums, k, index + 1);
        if (res != null) {
            return res;
        }
        res = maxSubsequence(nums, k - 1, index + 1);
        if (res != null) {
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = index;
            return res;
        }
        return null;
    }

    public static int[] maxSubsequence2(int[] nums, int k) {
        

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.size() + nums.length - i > k && nums[i] < stack.peek()) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        int[] ret = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ret[i] = stack.pop();
        }
    public static void main(String[] args) {
        //generateParenthesis("", 4);
        //int[] res = maxSubsequence2(new int[]{4,6,5,3,2,7}, 3);
        //System.out.println(Arrays.toString(res));
        System.out.println(check1(build("(())()")));
        System.out.println(check1(build("(]")));
    }

    public static Node build(String s) {
        Node head = null;
        Node last = null;
        for (int i = 0; i < s.length(); i++) {
            Node node = new Node(s.charAt(i), null);
            if (head == null) {
                head = node;
            } else {
                last.next = node;
            }
            last = node;
        }
        return head;
    }









        return ret;
    }

    
}