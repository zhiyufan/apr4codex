package com.codex;

import java.util.*;

public class Solution {
/*
 * Example :
 * 			Input: [1,3,4,1,3,1,4]
 *			Output: 2
 *
 *			Input: [1,2,2,1,2]
 *			Output: 2
 *
 *			Input: [1,1,1,1,1]
 *			Output: 1
 *
 * Explanation:
 * 			In this example, [1,2,2,1,2] are two different kinds of socks, and the maximum number of same-color socks that can be removed is 2.
 */

public class RemoveSameColorSocks {

	static class Sock{
		int color;
		int count;
		public Sock(int color, int count) {
			this.color = color;
			this.count = count;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(findMaximumSocks(new int[] {1,3,4,1,3,1,4}));
		System.out.println(findMaximumSocks(new int[] {1,2,2,1,2}));
		//System.out.println(findMaximumSocks(new int[] {1,1,1,1,1}));
	}

	public static int findMaximumSocks(int[] socks) {

		Map<Integer, Integer> sockMap = new HashMap<>();

		for(int i = 0; i < socks.length; i++) {
			sockMap.put(socks[i], sockMap.getOrDefault(socks[i], 0) + 1);
		}

		List<Sock> sockList = new ArrayList<>();
		sockMap.forEach((key, value) -> {
			Sock sock = new Sock(key, value);
			sockList.add(sock);
		});

		Collections.sort(sockList, new Comparator<Sock>() {
			@Override
			public int compare(Sock sock1, Sock sock2) {
				if(sock1.count == sock2.count) {
					return sock1.color - sock2.color;
				} else {
					return sock2.count - sock1.count;
				}
			}
		});

		int pair = 0;
		for(int i = 0; i < sockList.size(); i++) {
			pair += sockList.get(i).count/2;
		}
		return pair;
	}
}
}