package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums2) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums3) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }

/**
 * @author Aakash
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {1, 2, 5, 7};
		int[] num3 = {1, 3, 4, 5, 8};
		
		List<Integer> res = twoOutOfThree(num1, num2, num3);
		
		System.out.println(res);
	}
}
    
}