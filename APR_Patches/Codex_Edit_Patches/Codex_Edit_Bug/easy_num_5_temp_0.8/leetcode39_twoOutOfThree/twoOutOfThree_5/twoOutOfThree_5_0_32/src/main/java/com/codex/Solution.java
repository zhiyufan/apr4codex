package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CommonElements {

    public static List<Integer> twoOutOfThree(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<Integer>();
        Set<Integer> hSet1 = new HashSet<>();
        Set<Integer> hSet2 = new HashSet<>();
        for (int i=0; i<arr1.length; i++) {
            hSet1.add(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++) {
            if (hSet1.contains(arr2[i])) {
                hSet2.add(arr2[i]);
            }
        }
        for (int i=0; i<arr3.length; i++) {
            if (hSet1.contains(arr3[i])) {
                hSet2.add(arr3[i]);
            }
        }
        result.addAll(hSet2);
        return result;
    } 

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,3,4,5};
        int[] arr3 = {1,4,6,7};
        System.out.println(twoOutOfThree(arr1, arr2, arr3));
    }
}
}