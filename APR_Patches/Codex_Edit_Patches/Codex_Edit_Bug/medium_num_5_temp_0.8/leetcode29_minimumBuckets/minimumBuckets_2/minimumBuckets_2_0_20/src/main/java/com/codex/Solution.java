package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        int i = 0;
        while(i < streetChars.length){
            if(streetChars[i] == 'H'){
                if(bucketsCount == 0 && i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                    return -1;
                }
                bucketsCount++;
                i++;
            }
            else if(streetChars[i] == '.'){
                if(i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                    bucketsCount++;
                    i += 2;
                }
                else{
                    i++;
                }
            }
            else{
                return -1;
            }
        }
        return bucketsCount;

    }

    
}