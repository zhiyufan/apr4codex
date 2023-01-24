package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {

        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        boolean lastBucketPlaced = streetChars[0] == '.';
        if(streetChars.length == 1){
            return streetChars[0] == '.' ? 1 : -1;
        }
        int i = 0;
        while(i < streetChars.length){
            if(streetChars[i] == 'H'){
                if(bucketsCount > 0 && lastBucketPlaced && i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                    return -1;
                }
                if(lastBucketPlaced){
                    bucketsCount++;
                    lastBucketPlaced = false;
                }
                i++;
            }
            else if(streetChars[i] == '.'){
                if(lastBucketPlaced){
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