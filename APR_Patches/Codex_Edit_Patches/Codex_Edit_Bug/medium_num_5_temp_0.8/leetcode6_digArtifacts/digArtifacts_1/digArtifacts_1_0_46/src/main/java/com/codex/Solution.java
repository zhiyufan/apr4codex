package com.codex;

import java.util.*;

public class Solution {
public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
	Set<Integer> set = new HashSet<>();
	for (int[] artifact : artifacts) {
		Set<Integer> cur = new HashSet<>();
		int r1 = artifact[0];
		int c1 = artifact[1];
		int r2 = artifact[2];
		int c2 = artifact[3];
		for (int r = r1; r <= r2; r++) {
			for (int c = c1; c <= c2; c++) {
				int index = r * n + c;
				cur.add(index);
			}
		}
		set.add(cur.hashCode());
	}
	for (int[] digpos : dig) {
		int r = digpos[0];
		int c = digpos[1];
		int index = r * n + c;
		for (int i = 0; i < artifacts.length; i++) {
			int[] artifact = artifacts[i];
			int r1 = artifact[0];
			int c1 = artifact[1];
			int r2 = artifact[2];
			int c2 = artifact[3];
			Set<Integer> cur = new HashSet<>();
			for (int rd = r1; rd <= r2; rd++) {
				for (int cd = c1; cd <= c2; cd++) {
					int indexd = rd * n + cd;
					if (r == rd && c == cd) continue;
					cur.add(indexd);
				}
			}
			if (cur.size() == 0) continue;
			if (set.remove(cur.hashCode())) {
				artifacts[i] = null;
			}
		}
	}
	int count = 0;
	for (int[] artifact : artifacts) {
		if (artifact != null) count++;
	}
	return count;
}

    
    
}