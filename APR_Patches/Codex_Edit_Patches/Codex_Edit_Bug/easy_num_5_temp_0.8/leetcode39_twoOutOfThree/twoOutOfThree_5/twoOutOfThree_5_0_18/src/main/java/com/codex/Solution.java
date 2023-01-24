package com.codex;

import java.util.*;

public class Solution {
//    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//        
//        
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//        
//        for (int n: nums1) {
//            set1.add(n);
//        }
//        for (int n: nums2) {
//            if (set1.contains(n)) {
//                set2.add(n);
//            }
//        }
//        for (int n: nums3) {
//            if (set1.contains(n)) {
//                set2.add(n);
//            }
//        }
//        
//        return new ArrayList<>(set2);
//    }
//    
//    
public class Main {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        if (b1 || (++x == y++)) {
            System.out.println("x = " + x + " y = " + y);
        }

        if ((z += 3) == 3 || b2 && b2) {
            System.out.println("z = " + z);
        }

        if (b3 && (++y == z++)) {
            System.out.println("y = " + y + " z = " + z);
        }
    }
}
}