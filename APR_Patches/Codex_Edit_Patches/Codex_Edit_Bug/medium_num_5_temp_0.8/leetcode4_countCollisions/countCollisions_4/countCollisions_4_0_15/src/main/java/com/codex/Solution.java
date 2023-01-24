package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] != 'S' && dirs[j] != 'S') {
                    totalCollision += 2;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                } else if (dirs[i] != 'S' && dirs[j] == 'S') {
                    totalCollision += 1;
                    dirs[i] = 'S';
                } else if (dirs[i] == 'S' && dirs[j] != 'S') {
                    totalCollision += 1;
                    dirs[j] = 'S';
                }
            }
        }

        return totalCollision;
    }


    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] != 'S' && dirs[j] != 'S') {
                    totalCollision += 2;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                } else if (dirs[i] != 'S' && dirs[j] == 'S') {
                    totalCollision += 1;
                    dirs[i] = 'S';
                } else if (dirs[i] == 'S' && dirs[j] != 'S') {
                    totalCollision += 1;
                    dirs[j] = 'S';
                }
            }
        }

        return totalCollision;
    }


    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] != 'S' && dirs[j] != 'S') {
                    totalCollision += 2;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                } else if (dirs[i] != 'S' && dirs[j] == 'S') {
                    totalCollision += 1;
                    dirs[i] = 'S';
                } else if (dirs[i] == 'S' && dirs[j] != 'S') {
                    totalCollision += 1;
                    dirs[j] = 'S';
                }
            }
        }

        return totalCollision;
    }

    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] != 'S' && dirs[j] != 'S') {
                    totalCollision += 2;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                } else if (dirs[i] != 'S' && dirs[j] == 'S') {
                    totalCollision += 1;
                    dirs[i] = 'S';
                } else if (dirs[i] == 'S' && dirs[j] != 'S') {
                    totalCollision += 1;
                    dirs[j] = 'S';
                }
            }
        }

        return totalCollision;
    }


    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] != 'S' && dirs[j] != 'S') {
                    totalCollision += 2;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                } else if (dirs[i] != 'S' && dirs[j] == 'S') {
                    totalCollision += 1;
                    dirs[i] = 'S';
                } else if (dirs[i] == 'S' && dirs[j] != 'S') {
                    totalCollision += 1;
                    dirs[j] = 'S';
                }
            }
        }

        return totalCollision;
    }

// PSEUDO CODE

for (i < directions) {
    for (j < directions) {
        if (i != S && j != S) {
            add 2
            i = S
            j = S
        } else if (i != S && j == S) {
            add 1
            i = S
        } else if (i == S && j != S) {
            add 1
            j = S
        }
    }
}






// BUG FIX

    public static int countCollisions(String directions) {
        
        int totalCollision = 0;

        char[] dirs = directions.toCharArray();
        
        for (int i = 0; i < dirs.length; i++) {
            for (int j = i+1; j < dirs.length; j++) {
                if (dirs[i] != 'S' && dirs[j] != 'S') {
                    totalCollision += 2;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                    break;
                } else {
                    totalCollision += 1;
                    if (dirs[i] != 'S') {
                        dirs[i] = 'S';
                    }
                    if (dirs[j] != 'S') {
                        dirs[j] = 'S';
                    }
                    break;                    
                }
            }
        }

        return totalCollision;
    }
}