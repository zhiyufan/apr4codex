package com.codex;

import java.util.*;

public class Solution {

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        List<Integer> res=searchNumberIndices(a,2);
        for (Integer i:res) {
            System.out.print(i+" ");
        }
    }

    public static List<Integer> searchNumberIndices(int[] nums, int target) {

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }

}
}