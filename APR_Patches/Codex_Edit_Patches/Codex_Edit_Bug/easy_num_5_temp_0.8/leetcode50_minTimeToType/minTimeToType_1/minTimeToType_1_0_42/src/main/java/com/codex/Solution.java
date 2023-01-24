package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

public class file{
  public static void main(String args[]){

    String[] str1={"q","w","e","r","t","y","u","i","o","p","a","s","d"};
    String[] str2={"a","s","d","f","g","h","j","k","l","z","x","c","v"};
    String[] str3={"z","x","c","v","b","n","m"};
    findStrings(str1,str2,str3);
  }
  public static void findStrings(String[] str1,String[] str2,String[] str3){

    int[] pos={1,2,3};


    //int[] pos = new int[26];
    int i = 0;
    for (char ch = 'a'; ch <= 'z'; ch++) {
        pos[ch - 'a'] = i++;
    }

    int cur = 0, res = 0;
    for (char ch : word.toCharArray()) {
        res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
        cur = pos[ch - 'a'];
    }
    return res;
}
}



/*  public static int minTimeToType(String word) {


        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
            cur = pos[ch - 'a'];
        }
        return res;
} */
}