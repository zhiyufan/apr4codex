package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AmazonTest {

	public static void main(String[] args) {

		int[] a = { 1,2,3,4,5 };
		int[] b = { 1,2,3,4,5,6,7,8,9,10 };

		int[] c = findDifference(a, b);
		System.out.println("Diff is " + c[0] + " " + c[1]);

	}

	public static int[] findDifference(int[] a, int[] b) {

		int[] ans = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}
		for (int j = 0; j < b.length; j++) {
			map.put(b[j], map.getOrDefault(b[j], 0) - 1);
		}
		Set<Integer> keys = map.keySet();
		for (int key : keys) {
			if (map.get(key) == 1) {
				ans[0] = key;
			} else if (map.get(key) == -1) {
				ans[1] = key;
			}
		}
		return ans;

	}

}
    
}