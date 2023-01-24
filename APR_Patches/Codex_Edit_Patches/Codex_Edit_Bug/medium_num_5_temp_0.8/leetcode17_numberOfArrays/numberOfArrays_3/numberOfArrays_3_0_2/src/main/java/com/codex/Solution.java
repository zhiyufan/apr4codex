package com.codex;

import java.util.*;

public class Solution {
1. #2
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        long mod = 1000000007;
        long[][] dp = new long[differences.length + 1][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i < differences.length + 1; i++) {
            if (differences[i - 1] == 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * (upper - lower + 1) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower + 1) % mod) % mod;
            } else if (differences[i - 1] > 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * lower % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * (upper - lower) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * upper % mod) % mod;
            } else {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * upper % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * lower % mod) % mod;
            }
        }
        return (int) dp[differences.length][1];
    }


    2. #3
    public static String stringOfDeque(int[][] sequences) {
        StringBuilder builder = new StringBuilder();
        for (int[] sequence: sequences) {
            if (sequence[1] == 0) {
                builder.append(sequence[0]);
            } else {
                builder.insert(0, sequence[0]);
            }
        }
        return builder.toString();
    }

    3. #6
    public static String[] reorderLogFiles(String[] logs) {
        String[] letters = new String[logs.length];
        String[] digits = new String[logs.length];
        int l = 0;
        int d = 0;
        for (String log : logs) {
            String[] str = log.split(" ");
            if (Character.isDigit(str[1].charAt(0))) {
                digits[d++] = log;
            } else {
                letters[l++] = log;
            }
        }
        Arrays.sort(letters, 0, l, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String[] str1 = s1.split(" ");
                String[] str2 = s2.split(" ");
                int minLen = Math.min(str1.length, str2.length);
                int i;
                for (i = 1; i < minLen; i++) {
                    if (!str1[i].equals(str2[i])) {
                        return str1[i].compareTo(str2[i]);
                    }
                }
                return str1[0].compareTo(str2[0]);
            }
        });
        String[] result = new String[logs.length];
        System.arraycopy(letters, 0, result, 0, l);
        System.arraycopy(digits, 0, result, l, d);
        return result;
    }

    4. #7
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for (int pos = bucket.length - 1; pos >= 0; pos--) {
            if (bucket[pos] != null) {
                for (int num: bucket[pos]) {
                    result[index++] = num;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }

    5. #9
    public static int minSteps(int n) {
        if (n == 1) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return minSteps(n / i) + i;
            }
        }
        return n;
    }

    6. #10
    public static int maxSideLength(int[][] mat, int threshold) {
        int row = mat.length;
        int col = mat[0].length;
        int res = 0;
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < col + 1; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < col + 1; j++) {
                int len = 1;
                while (i - len >= 0 && j - len >= 0) {
                    int area = dp[i][j] - dp[i - len][j] - dp[i][j - len] + dp[i - len][j - len];
                    if (area > threshold) {
                        res = Math.max(res, len);
                        break;
                    }
                    len++;
                }
            }
        }
        return res;
    }
}