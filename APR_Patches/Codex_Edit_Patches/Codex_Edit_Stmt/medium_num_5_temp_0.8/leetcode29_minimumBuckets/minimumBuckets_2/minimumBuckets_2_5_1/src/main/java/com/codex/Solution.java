package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        boolean emptySpaceEncountered = false;
        int i = 0;
        while(i < streetChars.length){
            if(streetChars[i] == 'H'){
                if(emptySpaceEncountered && i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                    return -1;
                }
                bucketsCount++;
                emptySpaceEncountered = false;
                i++;
            }
            else{
                if(i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                    bucketsCount++;
                    emptySpaceEncountered = true;
                    i += 2;
                }
                else if(emptySpaceEncountered && streetChars[i - 1] != '.'){
                    return -1;
                }
                else{
                    emptySpaceEncountered = true;
                    i++;
                    bucketsCount++;
                }

            }
        }
        return bucketsCount;
    }

    
}