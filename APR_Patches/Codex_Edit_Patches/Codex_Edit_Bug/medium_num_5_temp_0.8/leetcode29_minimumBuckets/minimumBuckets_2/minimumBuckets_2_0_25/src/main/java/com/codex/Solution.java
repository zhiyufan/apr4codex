package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
		int bucketsCount = 0;
		int streetLength = street.length();
		boolean lastBucketPlaced = false;
		int i = 0;
		while (i < streetLength) {
			if (street.charAt(i) == 'H') {
				if (lastBucketPlaced && i < streetLength - 1 && street.charAt(i + 1) == 'H') {
					return -1;
				}
				bucketsCount++;
				lastBucketPlaced = false;
				i++;
			} else if (street.charAt(i) == '.') {
				if (i < streetLength - 1 && street.charAt(i + 1) == 'H') {
					bucketsCount++;
					lastBucketPlaced = true;
					i += 2;
				} else if (lastBucketPlaced && street.charAt(i - 1) != '.') {
					return -1;
				} else {
					lastBucketPlaced = true;
					i++;
					bucketsCount++;
				}
			} else {
				return -1;
			}
		}
		return bucketsCount;
	}
}