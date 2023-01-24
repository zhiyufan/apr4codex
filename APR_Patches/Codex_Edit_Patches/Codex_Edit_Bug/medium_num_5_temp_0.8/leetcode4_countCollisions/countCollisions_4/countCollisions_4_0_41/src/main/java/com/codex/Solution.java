package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) { //NSEW
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] == dirs[j]) {//if they are the same, there will be no collision
                    break;
                } else {
                    if (dirs[i] != 'S' && dirs[j] != 'S') {
                        totalCollision += 2;//collision
                        dirs[i] = 'S';
                        dirs[j] = 'S';
                    } else {
                        totalCollision++;//collision
                        if (dirs[i] != 'S') {
                            dirs[i] = 'S';
                        }
                        if (dirs[j] != 'S') {
                            dirs[j] = 'S';
                        }
                    }
                    break;
                }
            }
        }
		
		/*
		Example:
		
		String = WWWEEEESSSSEENN
		
		3 W's

		3 E's

		4 S's

		4 E's

		3 N's

		Total Collision = 13
		
		*/

        return totalCollision;
    }

    
}