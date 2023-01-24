package com.codex;

import java.util.*;

public class Solution {
public static int[] rearrangeArray2(int[] nums) {
        

        ArrayList<Integer> notAverage = new ArrayList<>();
        ArrayList<Integer> average = new ArrayList<>();
        int[] newArray;
        double averageValue = 0;

        if (nums.length > 1) {
            for (int i = 1; i < nums.length - 1; i++) {
                averageValue = (nums[i - 1] + nums[i + 1]) / 2.0;
                if (nums[i] > averageValue) {
                    notAverage.add(nums[i]);
                } else if (nums[i] < averageValue) {
                    average.add(nums[i]);
                }
            }
        }

        newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                newArray[0] = nums[0];
            } else if (i == nums.length - 1) {
                newArray[nums.length - 1] = nums[nums.length - 1];
            } else {
                if (notAverage.size() > 0) {
                    newArray[i] = notAverage.get(0);
                    notAverage.remove(0);
                } else if (average.size() > 0) {
                    newArray[i] = average.get(0);
                    average.remove(0);
                }
            }
        }

        return newArray;
    }

    static int[] sort(int[] nums) {
        int[] newArray = new int[nums.length];
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positives.add(nums[i]);
            } else {
                negatives.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (positives.size() > 0 && negativeIndex == 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex == 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            } else if (positives.size() > 0 && negativeIndex > 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex > 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            }

            if (newArray[i] >= 0) {
                positiveIndex = i;
            } else {
                negativeIndex = i;
            }
        }

        return newArray;
    }

    public static void string2(String a) {
        int left = 0;
        int right = 0;
        int leftStart = 0;
        int rightStart = 0;
        int max = 1;
        int start = 0;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i - 1) == a.charAt(i)) {
                rightStart++;
                right++;
            } else if (rightStart == left) {
                System.out.println("Found: " + a.substring(leftStart, rightStart));
                if (right - left > max) {
                    max = right - left;
                    start = left;
                }
                left = i;
                leftStart = i;
                right = left;
                rightStart = left;
            } else {
                left = i - 1;
                leftStart = i - 1;
                right = left;
                rightStart = left;
            }
        }

        System.out.println(start + " " + max);
        System.out.println(a.substring(start, start + max));
    }

    static void findZeroSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0 || nums[i] == 0) {
                System.out.println("Zero found");
                System.out.println(0 + " " + i);
                return;
            } else if (map.containsKey(sum)) {
                System.out.println("Sum found");
                System.out.println((map.get(sum) + 1) + " " + i);
                return;
            } else {
                map.put(sum, i);
            }
        }

        System.out.println("No sum found");
    }

    static void XMarksTheSpot(char[][] matrix, int x, int y) {
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == '@') {
                    counter++;
                }
            }
        }

        if (counter % 2 == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    static void findTheLonelyInteger(List<Integer> nums) {
        int lonely = 0;

        for (int i = 0; i < nums.size(); i++) {
            lonely ^= nums.get(i);
        }

        System.out.println(lonely);
    }
}