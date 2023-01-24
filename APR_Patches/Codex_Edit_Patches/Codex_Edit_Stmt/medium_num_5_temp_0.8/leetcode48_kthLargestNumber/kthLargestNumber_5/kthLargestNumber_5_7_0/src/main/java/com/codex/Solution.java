package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        if (nums == null || nums.length < k) {
            return null;
        }
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return getFirstComparison(a, b);
            }
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, comparator);
        for (String s : nums) {
            int curNum = Integer.parseInt(s);
            if (pq.size() < k) {
                pq.offer(curNum);
            } else {
                if (getFirstComparison(curNum, pq.peek()) >= 0) {
                    pq.poll();
                    pq.offer(curNum);
                }
            }
        }
        return pq.poll().toString();
    }

        if (a == b) {
            return 0;
        }
    private static int getFirstComparison(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int lenA = strA.length(), lenB = strB.length();
        int i = 0;
        while (i < lenA && i < lenB) {
            if (strA.charAt(i) < strB.charAt(i)) {
                return 1;
            } else if (strA.charAt(i) > strB.charAt(i)) {
                return -1;
            } else {
                i++;
            }
        }
        if (i == lenA && i == lenB) {
            return 0;
        } else if (i < lenA) {
            for (; i < lenA; i++) {
                if (strA.charAt(i) < strA.charAt(0)) {
                    return 1;
                } else if (strA.charAt(i) > strA.charAt(0)) {
                    return -1;
                }
            }
            return 1;
        } else {
            for (; i < lenB; i++) {
                if (strB.charAt(i) < strB.charAt(0)) {
                    return -1;
                } else if (strB.charAt(i) > strB.charAt(0)) {
                    return 1;
                }
            }
            return -1;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(kthLargestNumber(new String[]{"5", "4", "3", "2", "1"}, 5));
        System.out.println(kthLargestNumber(new String[]{"3", "4", "1", "5", "2", "6"}, 5));
        System.out.println(kthLargestNumber(new String[]{"2", "1", "21", "22"}, 2));
        System.out.println(kthLargestNumber(new String[]{"22", "21", "21", "21", "211", "1", "12"}, 5));
        System.out.println(kthLargestNumber(new String[]{"22", "21", "21", "21", "211", "1", "12"}, 6));
        System.out.println(kthLargestNumber(new String[]{"22", "21", "21", "21", "211", "1", "12"}, 7));
        System.out.println(kthLargestNumber(new String[]{"22", "21", "21", "21", "211", "1", "12"}, 4));
        System.out.println(kthLargestNumber(new String[]{"22", "21", "21", "21", "211", "1", "12"}, 3));
        System.out.println(kthLargestNumber(new String[]{"22", "21", "21", "21", "211", "1", "12"}, 2));
        System.out.println(kthLargestNumber(new String[]{"22", "21", "21", "21", "211", "1", "12"}, 1));
        System.out.println(kthLargestNumber(new String[]{"2221", "2221", "2221", "2221", "2221", "2221", "2221"}, 1));
        System.out.println(kthLargestNumber(new String[]{"2221", "2221", "2221", "2221", "2221", "2221", "2221"}, 2));
        System.out.println(kthLargestNumber(new String[]{"2221", "2221", "2221", "2221", "2221", "2221", "2221"}, 3));
        System.out.println(kthLargestNumber(new String[]{"2221", "2221", "2221", "2221", "2221", "2221", "2221"}, 4));
        System.out.println(kthLargestNumber(new String[]{"2221", "2221", "2221", "2221", "2221", "2221", "2221"}, 5));
        System.out.println(kthLargestNumber(new String[]{"2221", "2221", "2221", "2221", "2221", "2221", "2221"}, 6));
        System.out.println(kthLargestNumber(new String[]{"2221", "2221", "2221", "2221", "2221", "2221", "2221"}, 7));
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                        return -1;
                    } else if (strB.charAt(i) > strB.charAt(0)) {
                        return 1;
                    } else {
                        i++;
                    }
                }
            }
        }
        return 0;
    }
    
}