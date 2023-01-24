package com.codex;

import java.util.*;

public class Solution {
From: "sunnyday922@gmail.com" <sunnyday922@gmail.com>
To: support@gitbook.com
Sent: Wednesday, June 10, 2020 10:35:09 PM
Subject: New feedback for leetcode


Can you fix this problem in the for (int j = 0; j < nums.length; j++) {




    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}