package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0; i < nums1.length; i++) {
            if (i > 0 && nums1[i] == nums1[i - 1]) {
				continue;
			}
			int left = 0, right = 0;
			while (left < nums2.length && nums1[i] >= nums2[left]) {
				left++;
			}
			while (right < nums3.length && nums1[i] >= nums3[right]) {
				right++;
			}
			int count = 0;
			while (left < nums2.length && right < nums3.length) {
				if (nums2[left] == nums3[right]) {
					count++;
					if (count > 1) {
						result.add(nums2[left]);
						nums3[right] = 0;
						nums2[left] = 0;
						break;
					}
					left++;
					right++;
				} else if (nums2[left] < nums3[right]) {
					left++;
				} else {
					right++;
				}
			}
        }
        for (int i = 0; i < nums2.length; i++) {
			if (i > 0 && nums2[i] == nums2[i - 1]) {
				continue;
			}
			int left = 0, right = 0;
			while (left < nums1.length && nums2[i] >= nums1[left]) {
				left++;
			}
			while (right < nums3.length && nums2[i] >= nums3[right]) {
				right++;
			}
			int count = 0;
			while (left < nums1.length && right < nums3.length) {
				if (nums1[left] == nums3[right]) {
					count++;
					if (count > 1) {
						result.add(nums2[i]);
						nums3[right] = 0;
						nums1[left] = 0;
						break;
					}
					left++;
					right++;
				} else if (nums1[left] < nums3[right]) {
					left++;
				} else {
					right++;
				}
			}
        }
		return result;
    }

    
}