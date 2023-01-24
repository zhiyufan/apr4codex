package com.codex;

import java.util.*;

public class Solution {
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        int temp;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            temp = nums1[i];
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] < temp) {
                    temp = nums1[j];
                    count1 = j;
                }
            }
            nums1[count1] = nums1[i];
            nums1[i] = temp;
        }
        for (int i = 0; i < nums2.length; i++) {
            temp = nums2[i];
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] < temp) {
                    temp = nums2[j];
                    count2 = j;
                }
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            temp = nums3[i];
            for (int j = i + 1; j < nums3.length; j++) {
                if (nums3[j] < temp) {
                    temp = nums3[j];
                    count2 = j;
                }
            }
            nums3[count2] = nums3[i];
            nums3[i] = temp;
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                    break;
                }
            }
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    result.add(nums2[i]);
                    break;
                }
            }
        }
        return result;
    }

    
}