package com.codex;

import java.util.*;

public class Solution {
	public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = head.next;
        ListNode head1 = head.next;
         while(temp1 != null && temp1.next != null) {
            temp.next  = temp1.next;
            temp = temp.next;
            
            temp1.next = temp.next;
            temp1 = temp1.next;

        }
        temp.next = head1;
         return head;
    }

    public int numIslands(char[][] grid) {
         int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    count += 1;
                    count(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public void count(char[][] grid, int i, int j) {
        
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        count(grid, i + 1, j);
        count(grid, i - 1, j);
        count(grid, i, j + 1);
        count(grid, i, j - 1);
        
    }

	public int singleNumber(int[] nums) {
        
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if(((nums[j] >> i) & 1) == 1) {
                    sum++;
                    sum = sum % 3;
                }
            }
            if(sum != 0) {
                result |= sum << i;
            }
        }
        return result;
    }

    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > nums.length / 2) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }



    
}