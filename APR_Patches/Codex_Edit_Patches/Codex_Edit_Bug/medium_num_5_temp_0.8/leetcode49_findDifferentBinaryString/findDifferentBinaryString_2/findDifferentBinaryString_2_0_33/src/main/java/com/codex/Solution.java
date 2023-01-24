package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res.append(x);
        }
        return res.toString();
    }
    /*
    Find the maximum number of machines that can be placed in the room 
    such that no two machines touch each other 
    */
    
    public static int maxNumOfMachines(int[] room) {
        if (room == null || room.length == 0) {
            return 0;
        }
        Arrays.sort(room);
        int max = 1;
        int start = room[0];
        int end = room[0];
        for (int i = 1; i < room.length; ++i) {
            if (room[i] > end) {
                end = room[i];
                max++;
            }
            if (room[i] > end + 1) {
                start = room[i];
                end = room[i];
            }
        }
        return max;
    }


    
}