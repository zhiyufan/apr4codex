package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class D{
    
    public static int collision(String directions) {
        
        int countCollision = 0;

        char[] dirs = directions.toCharArray();

        for (int i=0; i < dirs.length; i++){
            for (int j = i+1; j < dirs.length; j++) { 
                    if (dirs[i] != dirs[j]) {
                        countCollision +=2;
                        dirs[i] = 'a';
                        dirs[j] ='a';
                        System.out.println(i + " , " + j);
                        
                    } else {
                        if (dirs[i] != 'a') {
                            dirs[i] = 'a';
                        }
                        if (dirs[j] != 'a') {
                            dirs[j] = 'a';
                        }
                    }
                    break;
                }
            }
        }

        return totalCollision;
    }

    
}