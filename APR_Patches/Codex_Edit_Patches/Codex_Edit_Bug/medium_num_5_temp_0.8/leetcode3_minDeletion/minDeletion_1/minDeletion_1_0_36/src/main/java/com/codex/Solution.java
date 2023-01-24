package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] nums2 = new int[n];

        for (int i = 0; i < n; i++) {
            nums2[i] = Integer.parseInt(strs[i]);
        }
        

        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (nums2[i] % 2 == 0) {
                if (nums2[i] == nums2[i+1]) {
                    count++;
                }
            } else {
                if (nums2[i] != nums2[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}