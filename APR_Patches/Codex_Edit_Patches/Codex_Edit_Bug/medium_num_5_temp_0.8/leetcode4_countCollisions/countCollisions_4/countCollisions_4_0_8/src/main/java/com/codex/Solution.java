package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(countCollisions("NENESS"));
        System.out.println(countCollisions("EWWS"));
        System.out.println(countCollisions("NEWSEWSNESSNESW"));
        System.out.println(countCollisions("E"));
        System.out.println(countCollisions("NNN"));
        System.out.println(countCollisions("EENN"));
    }


    public static int countCollisions(String directions) {

        int totalCollision = 0;

        char[] dirs = directions.toCharArray();

        for (int i = 0; i < dirs.length-1; i++) {
            if (dirs[i] == 'S') {
                continue;
            }

            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[j] == 'S') {
                    continue;
                }

                if (dirs[i] != dirs[j]) {
                    if (i+1 == j &&  dirs[i] == 'N' && dirs[j] == 'W') {
                        break;
                    } else {
                        dirs[i] = 'S';
                        dirs[j] = 'S';

                        if (i+1 == j) {
                            break;
                        }

                        for (int k = i+1; k < j; k++) {
                            if (dirs[k] == 'N' || dirs[k] == 'W') {
                                totalCollision += 2;
                                dirs[k] = 'S';
                            }
                            if (dirs[k] != 'S') {
                                totalCollision += 1;
                                dirs[k] = 'S';
                            }
                        }
                        break;
                    }
                } else {
                    totalCollision += 1;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                    break;
                }
            }
        }

        return totalCollision;
    }
}