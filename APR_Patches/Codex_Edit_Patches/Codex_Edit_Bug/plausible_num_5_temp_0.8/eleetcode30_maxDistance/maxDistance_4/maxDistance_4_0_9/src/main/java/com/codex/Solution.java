package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {

        int n = colors.length;
        int[][] range = new int[3][2];
        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        int minDis = n - 1;
        int[] indices = new int[3];
        for (int i = 0; i < 3; i++) {
            indices[i] = range[i][0];
        }
        Arrays.sort(indices);
        List<int[]> permutations = new ArrayList<>();
        do {
            permutations.add(indices.clone());
        } while (nextPermutation(indices));

        for (int[] permutation : permutations) {
            int first = -1, second = -1;
            for (int i = 0; i < 3; i++) {
                if (range[permutation[i]][0] != n) {
                    if (first == -1) first = range[permutation[i]][1];
                    else {
                        second = range[permutation[i]][0];
                        break;
                    }
                }
            }
            minDis = Math.min(minDis, Math.abs(first - second));
        }
        return minDis;
    }

    public static boolean nextPermutation(int[] nums) {
        int n = nums.length;

        int first = -1;
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] < nums[i + 1]) {
                first = i;
                break;
            }
        }
        if (first == -1) return false;

        int second = -1;
        for (int i = n - 1; i > first; --i) {
            if (nums[i] > nums[first]) {
                second = i;
                break;
            }
        }
        swap(nums, first, second);
        int left = first + 1, right = n - 1;
        while (left < right) {
            swap(nums, left++, right--);
        }
        return true;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
            for (int j = i + 1; j < 3; j++) {
                minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
                minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
            }
        }
        return minDis;
    }
}