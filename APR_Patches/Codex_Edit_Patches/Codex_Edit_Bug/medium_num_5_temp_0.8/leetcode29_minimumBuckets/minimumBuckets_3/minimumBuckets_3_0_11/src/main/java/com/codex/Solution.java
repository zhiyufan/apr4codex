package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
		int ret = 0;
		if (street != null && street.length() > 0) {
			char[] arr = street.toCharArray();
			int count = 0;
			Boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 'H') {
					if (i - 1 >= 0) {
						if (arr[i - 1] == '.') {
							arr[i - 1] = 'B';
							count++;
							flag = true;
						}
					}
					if (i + 1 < arr.length) {
						if (arr[i + 1] == '.') {
							arr[i + 1] = 'B';
							count++;
							flag = true;
						}
					}
				}
			}
			if (flag) {
				ret = count + minimumBuckets(new String(arr));
			}
		}
		return ret;
	}
}