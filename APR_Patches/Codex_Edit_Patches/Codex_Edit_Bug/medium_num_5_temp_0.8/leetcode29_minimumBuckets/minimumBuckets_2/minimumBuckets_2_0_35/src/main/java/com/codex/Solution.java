package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {
        int count = 0;
        int n = street.length();
        char[] ch = street.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]=='H'){
                count++;
            }
            else if(ch[i]=='.' && (i==0 || ch[i-1]=='.')){
                return -1;
            }
        }
        if(count>0)return count;
        else return -1;
    }
}