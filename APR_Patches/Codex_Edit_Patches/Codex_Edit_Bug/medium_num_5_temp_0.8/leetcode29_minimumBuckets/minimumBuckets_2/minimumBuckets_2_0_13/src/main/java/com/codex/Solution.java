package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
        int bucketsCount = 0;
        char lastChar = 'x';
        char[] streetChars = street.toCharArray();
        for(char c : streetChars){
            if(c == 'H' && lastChar != 'H'){
                bucketsCount++;
            }
            else if(c == '.'){
                bucketsCount++;
            }
            else if(c == 'H' && lastChar == 'H'){
                return -1;
            }
            else{
                return -1;
            }
            
            lastChar = c;
        }
        

        return bucketsCount;
    }
}