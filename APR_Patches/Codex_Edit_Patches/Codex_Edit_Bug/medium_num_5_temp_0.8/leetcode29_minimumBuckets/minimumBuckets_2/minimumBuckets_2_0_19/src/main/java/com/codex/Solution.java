package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        boolean lastBucketPlaced = false;
        int i = 0;
        while(i < streetChars.length){
            if(streetChars[i] == 'H'){
                if(lastBucketPlaced && i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                    return -1;
                }
                bucketsCount++;
                lastBucketPlaced = false;
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
        if(streetChars[streetChars.length - 1] == '.'){
            bucketsCount++;
        }
        return bucketsCount;
    }

    
}