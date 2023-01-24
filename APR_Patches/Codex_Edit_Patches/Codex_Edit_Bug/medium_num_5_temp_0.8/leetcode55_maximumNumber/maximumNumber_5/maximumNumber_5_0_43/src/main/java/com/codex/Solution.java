package com.codex;

import java.util.*;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while(i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }

        for (int i = 0; i < 10; i++) {
            if (cnt[i] > 0) {
                cnt[i]--;
                StringBuilder temp = new StringBuilder();
                for (int j = 9; j >= 0; j--) {
                    while (cnt[j] > 0) {
                        temp.append(j);
                        cnt[j]--;
                    }
                }

                cnt[i]++;
                res = temp.append(i).length() > res.length() ? temp.append(i) : res;
            }
        }

        return res.toString();
    }

    
}