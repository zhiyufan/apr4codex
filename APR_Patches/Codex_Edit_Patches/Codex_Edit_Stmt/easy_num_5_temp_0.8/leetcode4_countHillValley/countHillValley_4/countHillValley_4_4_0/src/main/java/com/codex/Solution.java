package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
     public static int[] histogram(int[][] image, int maxColor) {
        int[] histogramArray = new int[maxColor + 1];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                histogramArray[image[i][j]]++;
            }
        }
        return histogramArray;
    }



public int[][] sobel(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        for (int i = 1; i < image.length - 1; i++) {
            for (int j = 1; j < image[0].length - 1; j++) {
                int gX = -1 * image[i-1][j-1] + 1 * image[i-1][j+1] +
                        -2 * image[i][j-1] + 2 * image[i][j+1] +
                        -1 * image[i+1][j-1] + 1 * image[i+1][j+1];
                int gY = -1 * image[i-1][j-1] + -2 * image[i-1][j] + -1 * image[i-1][j+1] +
                        1 * image[i+1][j-1] + 2 * image[i+1][j] + 1 * image[i+1][j+1];

                result[i][j] = Math.abs(gX) + Math.abs(gY);
            }
        }
        return result;
    }



public int[][] sobel(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        for (int i = 1; i < image.length - 1; i++) {
            for (int j = 1; j < image[0].length - 1; j++) {
                int gX = -1 * image[i-1][j-1] + 1 * image[i-1][j+1] +
                        -2 * image[i][j-1] + 2 * image[i][j+1] +
                        -1 * image[i+1][j-1] + 1 * image[i+1][j+1];
                int gY = -1 * image[i-1][j-1] + -2 * image[i-1][j] + -1 * image[i-1][j+1] +
                        1 * image[i+1][j-1] + 2 * image[i+1][j] + 1 * image[i+1][j+1];

                result[i][j] = Math.abs(gX) + Math.abs(gY);
            }
        }
        return result;
    }


public boolean hasMajority(int[] nums) {
        int value = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (value == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    value = nums[i];
                    count = 1;
                }
            }
        }
        if (count == 0) {
            return false;
        }
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (value == nums[i]) {
                count++;
            }
        }
        return count >= nums.length / 2 + 1;
    }



public int[] concatenate(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }



public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
        return count;
    }


    
        return count;
    }


    
    
}