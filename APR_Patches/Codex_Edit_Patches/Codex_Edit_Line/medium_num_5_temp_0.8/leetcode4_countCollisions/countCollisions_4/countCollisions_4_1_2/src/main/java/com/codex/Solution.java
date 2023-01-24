package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int totalCollision = 0;
/*
Question: Given a string of "UDLR", how many times two cars collide with each other? 
*/
    public class Test {
        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length-1; i++) {
            for (int j = i+1; j < dirs.length-1; j++) {
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


    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.countCollisions("ULDRDU"));
    }
    }
        return totalCollision;
    }

    
}