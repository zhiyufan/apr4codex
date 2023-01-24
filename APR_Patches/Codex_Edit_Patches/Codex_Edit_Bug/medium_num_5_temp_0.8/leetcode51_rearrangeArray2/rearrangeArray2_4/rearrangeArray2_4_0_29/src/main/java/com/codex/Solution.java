package com.codex;

import java.util.*;

public class Solution {
    /**
     * 对于一个给定的整数数组，请找出其中没有出现的最小正整数。
     */
    private int getMinInt(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len + 1];
        for (int num : nums) {
            if (num <= len) {
                arr[num] = 1;
            }
        }
        for (int i = 1; i <= len; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return len + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] arr = str.split(",");
            int len = arr.length;
            int[] nums = new int[len];
            for (int i = 0; i < len; i++) {
                nums[i] = Integer.valueOf(arr[i]);
            }
            System.out.println(aver(nums));
        }
    }

    public static int[] rearrangeArray2(int[] nums) {
        
        double avg = aver(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num == avg) continue;
            list.add(num);
        }

        int[] ans = new int[nums.length];
        int index = 0;
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        Arrays.sort(a);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) {
                ans[i] = a[a.length - 1];
                a[a.length - 1] = 0;
            } else {
                ans[i] = a[index++];
            }
        }
        return ans;
    }

    private static double aver(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    
}