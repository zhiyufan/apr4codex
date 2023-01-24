package com.codex;

import java.util.*;

public class Solution {
public static long minimalKSum(int[] nums, int k) {
        
    Arrays.sort(nums);
    long sum = 0;
    int idx = 0;
    while (k > 0) {
        if (idx >= nums.length || nums[idx] > idx + 1) {
            sum += idx + 1;
            k--;
        } else {
            idx++;
        }
    }
    return sum;
}


// Build a segment tree
// First define the type of segment tree
// Then define the constructor
// Then define the method to construct the segment tree

public class NumArray {
    
    private int[] st;
    private int size;
    
    public NumArray(int[] nums) {
        
        int n = nums.length;
        this.size = n;
        if (n == 0)
            return;
        
        int x = (int)Math.ceil(Math.log(n)/Math.log(2));
        int maxSize = 2 * (int) Math.pow(2, x) - 1;
        st = new int[maxSize];
        
        constructST(nums, 0, n - 1, 0);
    }
    
    private int constructST(int[] nums, int left, int right, int idx) {
        
        if (left == right) {
            st[idx] = nums[left];
            return nums[left];
        }
        
        int mid = left + (right - left)/2;
        int leftMin = constructST(nums, left, mid, 2*idx + 1);
        int rightMin = constructST(nums, mid + 1, right, 2*idx + 2);
        st[idx] = Math.min(leftMin, rightMin);
        return st[idx];
    }
    
    public void update(int i, int val) {
        
        if (i < 0 || i >= size)
            return;
        
        update(0, 0, size - 1, i, val);
    }
    
    private int update(int idx, int left, int right, int i, int val) {
        
        if (i < left || i > right)
            return st[idx];
        
        if (left == right) {
            st[idx] = val;
            return val;
        }
        
        int mid = left + (right - left)/2;
        int leftMin = update(2*idx + 1, left, mid, i, val);
        int rightMin = update(2*idx + 2, mid + 1, right, i, val);
        st[idx] = Math.min(leftMin, rightMin);
        return st[idx];
    }
    
    public int getMin(int i, int j) {
        
        if (i < 0 || i >= size || j < 0 || j >= size || i > j)
            return -1;
        
        return getMin(0, 0, size - 1, i, j);
    }
    
    private int getMin(int idx, int left, int right, int i, int j) {
        
        if (left >= i && right <= j)
            return st[idx];
        
        if (left > j || right < i)
            return Integer.MAX_VALUE;
        
        int mid = left + (right - left)/2;
        int leftMin = getMin(2*idx + 1, left, mid, i, j);
        int rightMin = getMin(2*idx + 2, mid + 1, right, i, j);
        return Math.min(leftMin, rightMin);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */



// Min stack
public class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> min;
    
    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int x) {
        
        if (!st.isEmpty()) {
            
            if (x <= min.peek())
                min.push(x);
            }
        
        st.push(x);
        }
    
    public void pop() {
        
        if (st.peek().equals(min.peek()))
            min.pop();
        st.pop();
    }


    public int top() {
        
        return st.peek();
    }

    public int getMin() {
        
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}