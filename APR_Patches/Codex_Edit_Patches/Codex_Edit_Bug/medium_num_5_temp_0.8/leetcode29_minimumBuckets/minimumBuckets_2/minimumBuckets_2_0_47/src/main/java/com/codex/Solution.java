package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
        if(street.length() == 0){
            return 0;
        }
        if(street.length() == 1){
            return (street.equals("H"))? -1 : 1;
        }
        if(street.charAt(0) == 'H' || street.charAt(street.length() - 1) == 'H'){
            return -1;
        }
        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        boolean isEvenIndex = false;
        for(int i = 0; i < streetChars.length; i++){
            if(streetChars[i] == 'H' && (isEvenIndex || i == streetChars.length - 1 || streetChars[i + 1] == 'H')) return -1;
            if(!isEvenIndex && streetChars[i] == '.' && i != streetChars.length - 1 && streetChars[i + 1] != '.') bucketsCount++;
            isEvenIndex = !isEvenIndex;
        }
        return bucketsCount + 1;
    }

//     public static int minimumBuckets(String street) {
//         if(street.length() == 1){
//             return (street.equals("H"))? -1 : 1;
//         }
//         if(street.charAt(0) == 'H' || street.charAt(street.length() - 1) == 'H'){
//             return -1;
//         }
//         int bucketsCount = 0;
//         char[] streetChars = street.toCharArray();
//         boolean lastBucketPlaced = false;
//         int i = 0;
//         while(i < streetChars.length){
//             if(streetChars[i] == 'H'){
//                 if(lastBucketPlaced && i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
//                     return -1;
//                 }
//                 bucketsCount++;
//                 lastBucketPlaced = false;
//                 i++;
//             }
//             else if(streetChars[i] == '.'){
//                 if(i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
//                     bucketsCount++;
//                     lastBucketPlaced = true;
//                     i += 2;
//                 }
//                 else if(lastBucketPlaced && streetChars[i - 1] != '.'){
//                     return -1;
//                 }
//                 else{
//                     lastBucketPlaced = true;
//                     i++;
//                     bucketsCount++;
//                 }
//             }
//             else{
//                 return -1;
//             }
//         }
//         return bucketsCount;
//     }

    
}