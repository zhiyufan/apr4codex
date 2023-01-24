package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {
        
	int totalCollision = 0;

		char[] dirs = directions.toCharArray();
		int flag = 0;
		for (int i = 0; i < dirs.length; i++) {
			for (int j = i+1; j < dirs.length; j++) {
				if (dirs[i] == dirs[j] && dirs[i] != 'S' && dirs[j] != 'S') {
					totalCollision += 2;
					dirs[i] = 'S';
					dirs[j] = 'S';
					break;
				} else {
					if (dirs[i] == dirs[j] && dirs[i] == 'S') {
						continue;
					} else if ((dirs[i] != 'S' && dirs[j] == 'S')) {
						totalCollision += 1;
						dirs[i] = 'S';
					} else if ((dirs[i] == 'S' && dirs[j] != 'S')) {
						dirs[i] = 'S';
						continue;
					} else if ((dirs[i] != 'S' && dirs[j] != 'S')) {
						totalCollision += 1;
						dirs[i] = 'S';
						dirs[j] = 'S';
					} else if ((dirs[i] == 'S' && dirs[j] == 'S')) {
						continue;
					}
				}
			}
			
		}

		return totalCollision;
	}

    
}