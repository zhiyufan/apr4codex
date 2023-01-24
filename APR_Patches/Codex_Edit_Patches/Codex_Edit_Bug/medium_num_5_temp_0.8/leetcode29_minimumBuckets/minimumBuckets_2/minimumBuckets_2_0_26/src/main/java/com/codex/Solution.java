package com.codex;

import java.util.*;

public class Solution {
    public int minimumBuckets(String street) {
        int bucketsCount = 0;
        int lastPlantedBucketIndex = -1;
        if(street.length() == 0){
            return 0;
        }
        if(street.charAt(0) == 'H'){
            bucketsCount++;
        }
        if(street.length() == 1){
            return bucketsCount;
        }
        
        for(int i = 1; i < street.length(); i++){
            char currentChar = street.charAt(i);
            if(currentChar == 'H'){
                if(street.charAt(i - 1) == 'H'){
                    return -1;
                }
                bucketsCount++;
            }
            else if(currentChar == '.'){
                if(street.charAt(i - 1) != '.' && i < street.length() - 1 && street.charAt(i + 1) == 'H'){
                    lastPlantedBucketIndex = i;
                    bucketsCount++;
                }
                else if(street.charAt(i - 1) != '.' && i == street.length() - 1){
                    bucketsCount++;
                }
                else if(street.charAt(i - 1) == '.' && i < street.length() - 1 && street.charAt(i + 1) == 'H' && lastPlantedBucketIndex + 1 == i){
                    lastPlantedBucketIndex = i;
                }
                else if(street.charAt(i - 1) == '.' && i == street.length() - 1 && lastPlantedBucketIndex + 1 == i){
                }
                else{
                    return -1;
                }
            }
        }
        return bucketsCount;
    }


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
        return bucketsCount;
    }

    
}