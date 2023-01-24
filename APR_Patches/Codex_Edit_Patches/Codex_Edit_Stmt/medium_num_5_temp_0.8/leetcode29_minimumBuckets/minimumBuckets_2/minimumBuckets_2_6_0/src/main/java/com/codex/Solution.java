package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {// tajemství je v braní 3 polí a pak měnit, ale
        if(street.length() == 1 && street.charAt(0) == 'H'){
            return 1;
        }
        else if(street.length() == 1 && street.charAt(0) == '.'){
            return 1;
        }
        else if (street.length() == 2 && street.charAt(0) == 'H' && street.charAt(1) == 'H'){
            return -1;
        }
        else if (street.length() == 2 && street.charAt(0) == 'H' && street.charAt(1) == '.'){
            return 1;
        }
        else if (street.length() == 2 && street.charAt(0) == '.' && street.charAt(1) == 'H'){
            return 2;
        }
        else if (street.length() == 2 && street.charAt(0) == '.' && street.charAt(1) == '.'){
            return 2;
        }
        

        int bucketsCount = 0;
        char[] streetChars = street.toCharArray();
        boolean lastBucketPlaced = false;// jestli je posledni hrnec na poli
        boolean bucketCanBePlaced = true;//jestli na sorazajicích polích muze byt hrnec
            if(streetChars[i] != 'H' && streetChars[i] != '.'){//kontrola jestli nejsou neplatne znaky
                return -1;
            }
        int i = 0;
        while(i < streetChars.length){
            if(streetChars[i] == 'H'){
                if((lastBucketPlaced && i < streetChars.length - 1 && streetChars[i + 1] == 'H') || 
                   (!bucketCanBePlaced && i < streetChars.length - 1 && streetChars[i + 1] == 'H')){
                    return -1;
                }
                bucketsCount++;
                lastBucketPlaced = false;
                bucketCanBePlaced = true;
                i += 2;
            }
            else if(streetChars[i] == '.'){
                if(bucketCanBePlaced){
                    if(i < streetChars.length - 1 && streetChars[i + 1] == 'H'){
                        bucketsCount++;
                        bucketCanBePlaced = false;
                        lastBucketPlaced = true;
                        i += 2;
                    }
                    else{
                        lastBucketPlaced = true;
                        bucketCanBePlaced = false;
                        i++;
                        bucketsCount++;
                    }
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