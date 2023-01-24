package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] == dirs[j]) {
                    break;
                } else {
                    if (dirs[i] != 'S' && dirs[j] != 'S') {
                        totalCollision += 2;
                        dirs[i] = 'S';
                        dirs[j] = 'S';
                    } else {
                        totalCollision += 1;
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

        public static int countCollisions(String directions) {
        
        int totalCollision = 0;
        char[] dirs = directions.toCharArray();
        Set<Character> collided = new HashSet<>();

        for (int i = 0; i < dirs.length; i++) {
            if (dirs[i] == 'S' || collided.contains(dirs[i]))
                continue;
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] == dirs[j]) {
                    collided.add(dirs[i]);
                    totalCollision += 2;
                    if (j < dirs.length-1) {
                        collided.add(dirs[j]);
                        dirs[j] = 'S';
                    }
                    break;
                } 
            }
        }

        return totalCollision;


        public static int countCollisions(String directions) {
        
        int totalCollision = 0;
        char[] dirs = directions.toCharArray();
        Set<Character> collided = new HashSet<>();

        for (int i = 0; i < dirs.length; i++) {
            if (dirs[i] == 'S' || collided.contains(dirs[i]))
                continue;
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] == dirs[j]) {
                    collided.add(dirs[i]);
                    totalCollision += 2;
                    if (j < dirs.length-1) {
                        collided.add(dirs[j]);
                        dirs[j] = 'S';
                    }
                    break;
                } 
            }
        }

        return totalCollision;
    }
        return totalCollision;
    }

    
}