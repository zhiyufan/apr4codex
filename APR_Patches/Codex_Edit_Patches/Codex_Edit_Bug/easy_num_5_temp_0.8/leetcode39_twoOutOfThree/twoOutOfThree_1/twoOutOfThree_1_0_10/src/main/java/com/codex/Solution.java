package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Codelab {

    public static List<Integer> twoOutOfThree(int[] array1, int[] array2, int[] array3) {
        Map<Integer, Integer> storeValues = new HashMap<>();
        List<Integer> result = new ArrayList<>(); 
        for (int i : array1) {
            storeValues.put(i, storeValues.getOrDefault(i, 0) + 1);
        }
        for (int i : array2) {
            storeValues.put(i, storeValues.getOrDefault(i, 0) + 1);
        }
        for (int i : array3) {
            storeValues.put(i, storeValues.getOrDefault(i, 0) + 1);
        }
        for (Integer key : storeValues.keySet()) {
            if (storeValues.get(key) >= 2) {
                result.add(key);
            }
        }
        return result;
    }

    public static List<Integer> twoOutOfThree_FirstTry(int[] array1, int[] array2, int[] array3) {
        List<Integer> result = new ArrayList<>(); 
        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.sort(array3);
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    if (array1[i] == 0) {
                        continue; // Don't add zero to the result
                    } else {
                        result.add(array1[i]);
                        array1[i] = 0;
                        array2[j] = 0;
                        break; // Do not continue with further evaluation with array2
                    }
                }
            }
            for (int j = 0; j < array3.length; j++) {
                if (array1[i] == array3[j]) {
                    if (array1[i] == 0) {
                        continue; // Don't add zero to the result
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