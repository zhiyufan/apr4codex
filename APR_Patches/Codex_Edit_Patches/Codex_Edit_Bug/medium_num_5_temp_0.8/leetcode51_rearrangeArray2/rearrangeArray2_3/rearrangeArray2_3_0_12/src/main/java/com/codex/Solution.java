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

    

public static int subString(String s) {
        int max = 0;

        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    if (i != 0) {
                        if (s.charAt(i - 1) == '1') {
                            int count = 0;
                            for (int j = i; j < s.length(); j++) {
                                if (s.charAt(j) == '0') {
                                    count++;
                                } else {
                                    break;
                                }
                            }
                            if (count > max) {
                                max = count;
                            }
                        }
                    }
                }
            }
        }

        return max;
    }

    public static int findIndex(int[] nums) {
        int index = 0;
        int count = 0;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                int check = nums[i];
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] > check) {
                        count++;
                    }
                }
                if (count > nums.length / 2) {
                    index = i;
                    break;
                } else {
                    count = 0;
                }
            }
        }

        return index;
    }
    
    public static int[] sort(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            if (nums[low] == 0) {
                low++;
            } else if (nums[high] == 1) {
                high--;
            } else if (nums[low] > nums[high]) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }

        return nums;
    }
}