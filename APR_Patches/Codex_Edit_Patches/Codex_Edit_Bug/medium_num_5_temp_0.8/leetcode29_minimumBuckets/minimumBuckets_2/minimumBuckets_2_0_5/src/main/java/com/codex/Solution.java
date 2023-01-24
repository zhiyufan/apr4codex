package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        if(street.length() == 0){
            return 0;
        }

        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        boolean lastBucketPlaced = false;
        int i = 0;
        while(i < streetChars.length){
            if(streetChars[i] == 'H'){
                if(i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                    if(lastBucketPlaced){
                        return -1;
                    }
                    else{
                        bucketsCount++;
                        i += 2;
                        lastBucketPlaced = false;
                    }
                }
                else{
                    if(lastBucketPlaced){
                        return -1;
                    }
                    else{
                        bucketsCount++;
                        i++;
                        lastBucketPlaced = false;
                    }
                }
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