package com.codex;

import java.util.*;

public class Solution {
public class HillValley {

    public static void main(String[] args) throws java.lang.Exception {
        int[] a = {1, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2};
        int count = countHillValley(a);
        System.out.println(count);
    }

    public static int countHillValley(int[] nums) {

        if (nums == null || nums.length < 3)
            return 0;

        int curIndex = 1;
        int count = 0;


        if (nums[0] < nums[1]) {
            curIndex = 1;
        } else if (nums[0] > nums[1]) {
            curIndex = -1;
        }

        while (curIndex < nums.length - 1) {

            if (nums[curIndex] < nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] > nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] > nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] < nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] == nums[curIndex + 1]) {
                curIndex++;
            }
        }


        return count;
    }


    public static int countHillValley1(int[] nums) {

        if (nums == null || nums.length < 3)
            return 0;

        int curIndex = 1;
        int count = 0;


        if (nums[0] < nums[1]) {
            curIndex = 1;
        } else if (nums[0] > nums[1]) {
            curIndex = -1;
        }

        while (curIndex < nums.length - 1) {

            if (nums[curIndex] < nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] > nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] > nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] < nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] == nums[curIndex + 1]) {
                curIndex++;
            }
        }


        return count;
    }

    public static int countHillValley3(int[] nums) {

        if (nums == null || nums.length < 3)
            return 0;


        if (nums[0] < nums[1]) {
            curIndex = 1;
        } else if (nums[0] > nums[1]) {
            curIndex = -1;
        }

        while (curIndex < nums.length - 1) {

            if (nums[curIndex] < nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] > nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] > nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] < nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] == nums[curIndex + 1]) {
                curIndex++;
            }
        }


        return count;
    }


    public static int countHillValley4(int[] nums) {

        if (nums == null || nums.length < 3)
            return 0;


        if (nums[0] < nums[1]) {
            curIndex = 1;
        } else if (nums[0] > nums[1]) {
            curIndex = -1;
        }

        while (curIndex < nums.length - 1) {

            if (nums[curIndex] < nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] > nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] > nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] < nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] == nums[curIndex + 1]) {
                curIndex++;
            }
        }


        return count;
    }

    public static int countHillValley5(int[] nums) {

        if (nums == null || nums.length < 3)
            return 0;

        int curIndex = 1;
        int count = 0;


        if (nums[0] < nums[1]) {
            curIndex = 1;
        } else if (nums[0] > nums[1]) {
            curIndex = -1;
        }

        while (curIndex < nums.length - 1) {

            if (nums[curIndex] < nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] > nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] > nums[curIndex + 1]) {
                if (curIndex != 1 && nums[curIndex - 1] < nums[curIndex])
                    count++;
                curIndex = curIndex + 1;
            } else if (nums[curIndex] == nums[curIndex + 1]) {
                curIndex++;
            }
        }


        return count;
    }


    public static int countHillValley2(int[] nums) {

        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        return result;
    }
}
}