package com.codex;

import java.util.*;

public class Solution {
    ```java
//LeetCode 1617. Count Subtrees With Max Distance Between Cities
    class Solution {
        public int[] countSubgraphsForEachDiameter(int n, int[][] edges) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) map.put(i, new ArrayList<>());
            for (int i = 0; i < edges.length; i++) {
                int v1 = edges[i][0];
                int v2 = edges[i][1];
                List<Integer> list1 = map.get(v1 - 1);
                List<Integer> list2 = map.get(v2 - 1);
                list1.add(v2 - 1);
                list2.add(v1 - 1);
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) list.add(i);
            int[] ans = new int[n - 1];
            for (int i = 0; i < (1 << n); i++) {
                if (Integer.bitCount(i) == 1) continue;
                if (Integer.bitCount(i) == n) {
                    ans[n - 2]++;
                    continue;
                }
                List<Integer> set = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0) set.add(list.get(j));
                }
                if (!isConnected(set, map)) continue;
                int max = 0;
                for (Integer s : set) {
                    int m = bfs(s, set, map);
                    max = Math.max(max, m);
                }
                ans[max - 1]++;
            }
            return ans;
        }

        private int bfs(Integer s, List<Integer> set, Map<Integer, List<Integer>> map) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(s);
            int num = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                num++;
                while (size-- > 0) {
                    Integer v = queue.poll();
                    List<Integer> list = map.get(v);
                    for (Integer w : list) {
                        if (!set.contains(w)) continue;
                        queue.add(w);
                    }
                }
            }
            return num;
        }

        private boolean isConnected(List<Integer> list, Map<Integer, List<Integer>> map) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(list.get(0));
            Set<Integer> set = new HashSet<>();
            while (!queue.isEmpty()) {
                Integer v = queue.poll();
                List<Integer> l = map.get(v);
                for (Integer w : l) {
                    if (!list.contains(w)) continue;
                    if (set.contains(w)) continue;
                    queue.add(w);
                }
                set.add(v);
            }
            return set.size() == list.size();
        }
    }


    //LeetCode 1618. Maximum Font to Fit a Sentence in a Screen
    class Solution {
        private List<Character> list = new ArrayList<>();
        private double[] widths;

        public int maxFont(String s, int w, int h, int[] widths, int[] heights) {
            for (int i = 0; i < widths.length; i++) {
                list.add((char) ('a' + i));
            }
            this.widths = new double[widths.length];
            for (int i = 0; i < widths.length; i++) {
                this.widths[i] = widths[i];
            }
            int l = 1;
            int r = heights.length;
            while (l < r) {
                int mid = (l + r + 1) / 2;
                int res = bs(mid, s, w, h);
                if (res == 0) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
            return l;
        }

        private int bs(int k, String s, int w, int h) {
            double a = k;
            double b = heights[k - 1];
            double c = w;
            double d = h;
            double mid = (b * c) / a;
            if (mid >= d) return -1;
            double length = 0;
            int rows = 1;
            for (char ch : s.toCharArray()) {
                length += widths[ch - 'a'] * a;
                if (length > w) {
                    rows++;
                    length = widths[ch - 'a'];
                }
            }
            if (rows * mid > h) return 1;
            return 0;
        }
    }

    ```

    ```go
    //leetcode 1616. Split Two Strings to Make Palindrome
    func checkPalindromeFormation(a string, b string) bool {
        return helper(a, b) || helper(b, a)
    }
    
    func helper(a, b string) bool {
        l := len(a)
        for i, j := 0, l-1; i < j; i, j = i+1, j-1 {
            if a[i] != b[j] {
                return checkPalin(a, i, j) || checkPalin(b, i, j)
            }
        }
        return true
    }
    
    func checkPalin(s string, i, j int) bool {
        for i < j {
            if s[i] != s[j] {
                return false
            }
            i++
            j--
        }
        return true
    }
    ```

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