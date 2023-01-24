package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        String[] arr = directions.split("");
        for (int i = 0; i < directions.length(); i++) {
            if (!arr[i].equals("S")) 
            {
                for (int j = i+1; j < directions.length(); j++) {
                    if (arr[i].equals(arr[j])) 
                    {
                        if (!arr[j].equals("S")) 
                        {
                            collisions += 2;
                            arr[j] = "S";
                            arr[i] = "S";
                            break;
                        }
                    }
                }
            }
        }
        return collisions;
    }

    
}