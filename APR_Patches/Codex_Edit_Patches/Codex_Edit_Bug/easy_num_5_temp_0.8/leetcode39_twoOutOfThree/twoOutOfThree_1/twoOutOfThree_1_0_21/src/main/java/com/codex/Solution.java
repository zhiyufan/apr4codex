package com.codex;

import java.util.*;

public class Solution {
public static int[] SortedArraysMerge(int[] arr1, int[] arr2) {
        
        int[] result = new int[arr1.length + arr2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            } else {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        
        return result;
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        int[] sorted3Arr = SortedArraysMerge(nums1, nums2);
        
        int[] sortedResult = SortedArraysMerge(sorted3Arr, nums3);
        
        List<Integer> result = new ArrayList<>();
        
        int count = 0;
        
        for (int i = 0; i < sortedResult.length - 1; i++) {
            
            if (sortedResult[i] == sortedResult[i + 1]) {
                count++;
            }
            
            if (count == 2 && sortedResult[i] != sortedResult[i + 1]) {
                result.add(sortedResult[i]);
                count = 0;
            }
        }
        
        return result;
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums2[j] = 0;
                        break;
                    }
                }
            }
            for (int j = 0; j < nums3.length; j++) {
                if (nums1[i] == nums3[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    if (nums2[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2[i]);
                        nums2[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }


    
}