package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Test{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] rungs = new int[n];
		for(int i = 0; i < n; i++){
			rungs[i] = sc.nextInt();
		}
		int dist = sc.nextInt();
		int i = 0;
		while(i < n){
			int p = 0;
			int j = i;
			int count = 0;
			for(; j > i - 2; j--){
				if(j > 0)
					p += rungs[j] - rungs[j - 1];
			}
			if(p > dist)
				count++;
			while(i < n && rungs[i] - rungs[i - 1] <= dist){
				i++;
			}
			i++;
			/*int max = 0;
			for (int i = 0; i < rungs.length; i++) {
				if (rungs[i] > max) {
					if (rungs[i] - max > dist) {
						count++;
						max = max + dist;
					} else if (rungs[i] - max <= dist) {
						max = rungs[i];
					}
				}
			}*/

			System.out.println(count);
		}
    }


}
}