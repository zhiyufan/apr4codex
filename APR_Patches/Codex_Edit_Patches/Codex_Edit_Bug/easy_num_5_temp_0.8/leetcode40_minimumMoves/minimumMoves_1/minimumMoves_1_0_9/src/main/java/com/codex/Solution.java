package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        int c = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                c++;
                i += 2;
            }
        }
        int count = 0;
        int c = 0;

        while (c > 0) {
            c = 0;
            for (int i = 2; i < s.length(); i++) {
                if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                    count++;
                    c++;
                    i += 2;
                }
            }
        }
        return count;
    }
    
    //https://www.hackerrank.com/challenges/flipping-bits/problem
    static long flippingBits(long n) {
        // convert this to a 32 bit representation, flip all the bits
        // if the input is already 32 bits, it's already converted
        return Long.MAX_VALUE - n;
    }

    //https://www.hackerrank.com/challenges/minimum-draws/problem
    static int minimumDraws(int n) {
        // we need to draw n + 1 socks as we will draw the lost pair last
        return n + 1;

    }

    // https://www.hackerrank.com/challenges/library-fine/problem
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 < y2) {
            return 0;
        }
        if (y1 > y2) {
            return 10000;
        }
        if (m1 < m2) {
            return 0;
        }
        if (m1 > m2) {
            return (m1 - m2) * 500;
        }
        if (d1 > d2) {
            return (d1 - d2) * 15;
        }
        return 0;

    }

    // https://www.hackerrank.com/challenges/repeated-string/problem
    static long repeatedString(String s, long n) {
        if (s.length() == 1) return n;
        StringBuilder sb = new StringBuilder();
        long a_count = 0;
        long result = 0;
        boolean finished = false;

        while (sb.length() < n) {
            for (int i = 0; i < s.length(); i++) {
                if (sb.length() == n) {
                    finished = true;
                    break;
                }
                if (s.charAt(i) == 'a') {
                    a_count++;
                }
                sb.append(s.charAt(i));
            }
            if (finished) break;
            result += a_count;
        }

        return result;
    }

    // https://www.hackerrank.com/challenges/minimum-distances/problem
    static int minimumDistances(int[] a) {
        int min_dist = Integer.MAX_VALUE;
        int current_dist = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    current_dist = j - i;
                    if (current_dist < min_dist) {
                        min_dist = current_dist;
                    }
                }
            }
        }
        return min_dist == Integer.MAX_VALUE ? -1 : min_dist;

    }
    // https://www.hackerrank.com/challenges/sherlock-and-array/problem
    static String balancedSums(List<Integer> arr) {
        int sum = arr.stream().mapToInt(i -> i).sum();
        int left_sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (left_sum == (sum - left_sum - arr.get(i))) {
                return "YES";
            }
            left_sum += arr.get(i);
        }
        return "NO";

    }

    // https://www.hackerrank.com/challenges/dynamic-array/problem
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // create an array of arraylist
        ArrayList<Integer>[] seqList = new ArrayList[n];
        ArrayList<Integer> result = new ArrayList<>();

        int lastAnswer = 0;
        int x, y;
        for (List<Integer> query : queries) {
            // System.out.println(Arrays.toString(seqList));
            x = query.get(1);
            y = query.get(2);
            if (query.get(0) == 1) {
                // seq = (x ^ lastAnswer) % n
                int seq = (x ^ lastAnswer) % n;
                if (seqList[seq] == null) {
                    seqList[seq] = new ArrayList<Integer>();
                }
                seqList[seq].add(y);
            } else {
                // seq = (x ^ lastAnswer) % n
                int seq = (x ^ lastAnswer) % n;
                lastAnswer = seqList[seq].get(y % seqList[seq].size());
                result.add(lastAnswer);
            }
        }

        return result;
    }

    // https://www.hackerrank.com/challenges/non-divisible-subset/problem
    static int nonDivisibleSubset(int k, int[] S) {
        int[] remainder = new int[k];
        for (int s : S) {
            remainder[s % k]++;
        }
        int count = 0;
        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                count += Math.max(remainder[i], remainder[k - i]);
            }
        }
        if (remainder[0] > 0) count++;
        if (k % 2 == 0 && remainder[k / 2] > 0) count++;
        return count;
    }

    static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }
}