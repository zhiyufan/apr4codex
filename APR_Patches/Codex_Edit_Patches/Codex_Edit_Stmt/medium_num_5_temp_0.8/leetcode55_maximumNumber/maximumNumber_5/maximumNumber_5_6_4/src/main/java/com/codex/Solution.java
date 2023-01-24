package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        

        StringBuilder res = new StringBuilder(num);
        int[] cnt = new int[10];

        for (int i = 0; i < res.length(); i++) {
            cnt[res.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            if (cnt[i] > 0) {
                cnt[i]--;
                StringBuilder temp = new StringBuilder();
                for (int j = 9; j >= 0; j--) {
                    while (cnt[j] > 0) {
                        temp.append(j);
                        cnt[j]--;
                    }
                }

                cnt[i]++;
                res = temp.append(i).length() > res.length() ? temp.append(i) : res;



// 
public String largestNumber(int[] nums) {
    String[] str = new String[nums.length];
    for (int i = 0; i < str.length; i++) {
        str[i] = String.valueOf(nums[i]);
    }

    Arrays.sort(str, new Comparator<String>() {
        public int compare(String s1, String s2) {
            return (s2 + s1).compareTo(s1 + s2);
        }
    });

    StringBuilder sb = new StringBuilder();
    for (String s : str) {
        sb.append(s);
    }

    return sb.charAt(0) == '0' ? "0" : sb.toString();
}




//
public static class Pair implements Comparable<Pair> {
    public int a;
    public int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Pair other) {
        if (a != other.a) {
            return Integer.compare(a, other.a);
        } else {
            return Integer.compare(b, other.b);
        }
    }
}
            }
        }

        return res.toString();
    }

    
}