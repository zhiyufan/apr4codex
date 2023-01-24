package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        boolean lastBucketPlaced = false;
            if(streetChars[i] == 'H' && streetChars[i + 1] == 'H' && i == streetChars.length - 2)
                return -1;
        int i = 0;
        while(i < streetChars.length){
            if(streetChars[i] == 'H'){
                bucketsCount++;
                lastBucketPlaced = true;
                i++;
            }
            else if(streetChars[i] == '.'){
                if(i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                    bucketsCount++;
                    lastBucketPlaced = true;
                    i += 2;
                }
                else if(lastBucketPlaced && streetChars[i - 1] != '.'){
                    return -1;
                }
                else{
                    lastBucketPlaced = true;
                    i++;
                    bucketsCount++;
                }
            }
            else{
                return -1;
            }
        }
        return bucketsCount;
    }

    
}