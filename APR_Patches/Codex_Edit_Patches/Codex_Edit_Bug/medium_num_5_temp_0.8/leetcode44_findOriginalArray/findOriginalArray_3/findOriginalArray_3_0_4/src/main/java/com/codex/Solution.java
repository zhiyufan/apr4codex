package com.codex;

import java.util.*;

public class Solution {
public class Solution {
	public static int[] findOriginalArray(int[] changed) {

		if (changed.length % 2 != 0)
			return new int[0];
		int[] original = new int[changed.length / 2];
		HashMap<Integer, Integer> map = new HashMap<>();
		int oddCount = 0;
		for (int i : changed) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			if (map.get(i) % 2 != 0) {
				oddCount++;
			} else {
				oddCount--;
			}
		}
		if (oddCount != 0)
			return new int[0];
		int index = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			for (int j = 0; j < entry.getValue() / 2; j++) {
				original[index] = key;
				index++;
			}
		}
		return original;
	}
}