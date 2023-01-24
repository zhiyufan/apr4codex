package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int A = 0, B = 0;
        if(arr[0]=='A') {
            A++;
        }
        else {
            B++;
        }
        for(int i=1; i<arr.length; i++) {
            if(arr[i]==arr[i-1])
                if(arr[i]=='A') 
                    A++;
                else
                    B++;
        }
        if(A>B) {
            return true;
        }
        return false;
    }
    
}