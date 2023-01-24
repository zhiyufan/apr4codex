package com.codex;

import java.util.*;

public class Solution {
public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int lastIndex = 0;
		for (int i = nums1.length - 1; i >= 0; i--) {
			if (n >= 0 && m >= 0 && nums1[m] <= nums2[n]) {
				nums1[i] = nums2[n--];
			} else if (m >= 0){
				nums1[i] = nums1[m--];
			} else if (n >= 0) {
				nums1[i] = nums2[n--];
			}
        }
	}

    
}