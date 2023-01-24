package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int[] leftCount = new int[n];
        int[] rightCount = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            leftCount[i] = cur;
        }
        cur = 0;
        for (int i = n - 1; i >= 0; i--) {
            cur += nums[i] ^ 1;
            rightCount[i] = cur;
        }
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : leftCount[i - 1];
            int right = i == n - 1 ? 0 : rightCount[i + 1];
            int sum = left + right;
            if (sum > max) {
                max = sum;
                res = new ArrayList<>();
                res.add(i);
            } else if (sum == max) {
                res.add(i);
            }
        }
        return res;
    }
    class Point implements Comparable<Point> {
        int x;
        int y;
        int index;
        public Point(int[] arr, int i) {
            x = arr[i];
            y = arr[i + 1];
            index = i / 2;
        }
        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }
    public int[][] reconstructQueue(int[][] people) {
        Point[] array = new Point[people.length];
        for (int i = 0; i < people.length; i++) {
            array[i] = new Point(people[i], 0);
        }
        Arrays.sort(array);
        List<Point> res = new ArrayList<>();
        for (Point p : array) {
            if (p.x < 10) {
                res.add(0, p);
            } else {
                res.add(p);
            }
        }
        int[][] ans = new int[res.size()][2];
        int i = 0;
        for (Point p : res) {
            ans[i][0] = p.x;
            ans[i][1] = p.y;
            i++;
        }
        return ans;
    }

    
}