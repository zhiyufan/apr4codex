package com.codex;

import java.util.*;

public class Solution {
    /*
    *   MinimumBuckets
    *   
    *   Problem:
    *   A bucket is used to collect rain water from the roof.
    *   Add the buckets to collect the maximum amount of water from the roof.
    *   The buckets can be placed only on the flat roof.
    *   Input: Roof design - a string consisting of "." and "H" characters.
    *   Output: The minimum number of buckets to collect the maximum amount of water from the roof.
    *   Example:
    *   In the string ".HH..H..HH....H....H..H.." minumum number of buckets = 4
    *   because it can collect four buckets full of water.
    */

    public static int minimumBuckets(String street) {


        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        boolean lastBucketPlaced = false;
        int i = 0;
        while(i < streetChars.length){
            if(streetChars[i] == 'H'){
                if((lastBucketPlaced && i < streetChars.length - 1 && streetChars[i + 1] == 'H')
                   || (i == streetChars.length - 1 && lastBucketPlaced == false)){
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