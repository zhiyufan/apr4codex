package com.codex;

import java.util.*;

public class Solution {
    import java.util.ArrayList;


    public static int countCollisions(String directions) {
        char[] characters = directions.toCharArray();
        int total = 0;
        for(int i = 0; i < characters.length; i++) {
            if(characters[i] == 'N' || characters[i] == 'W') {
                total++;
            }
        }
        return total;
    }

    
}