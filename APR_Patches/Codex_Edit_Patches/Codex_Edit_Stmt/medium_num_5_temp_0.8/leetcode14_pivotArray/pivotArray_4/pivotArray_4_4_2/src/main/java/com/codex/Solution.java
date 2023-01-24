package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int[] result = new int[nums.length];
        int less = 0;
        int greater = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[less++] = nums[i];
            } else if (nums[i] > pivot) {
                result[greater--] = nums[i];
            }
        }
        while (less <= greater) {
            result[less++] = pivot;
        }
        return result;
    }

    public static String[] naturalSort(String[] strings) {
        List<String> stringsList = new ArrayList<>(Arrays.asList(strings));
        Collections.sort(stringsList, (String a, String b) -> {
            int i = 0, j = 0;
            while (i < a.length() && j < b.length()) {
                if (Character.isDigit(a.charAt(i)) && Character.isDigit(b.charAt(j))) {
                    int aNum = 0;
                    while (i < a.length() && Character.isDigit(a.charAt(i))) {
                        aNum = aNum * 10 + (a.charAt(i++) - '0');
                    }
                    int bNum = 0;
                    while (j < b.length() && Character.isDigit(b.charAt(j))) {
                        bNum = bNum * 10 + (b.charAt(j++) - '0');
                    }
                    if (aNum != bNum) {
                        return aNum - bNum;
                    }
                } else if (a.charAt(i) != b.charAt(j)) {
                    return a.charAt(i) - b.charAt(j);
                } else {
                    i++;
                    j++;
                }
            }
            return a.length() - b.length();
        });
        return stringsList.toArray(new String[stringsList.size()]);
    }
}