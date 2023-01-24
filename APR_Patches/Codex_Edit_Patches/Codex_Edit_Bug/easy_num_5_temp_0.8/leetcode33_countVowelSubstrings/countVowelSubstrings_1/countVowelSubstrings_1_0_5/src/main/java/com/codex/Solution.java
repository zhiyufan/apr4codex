package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int count = countVowelSubstrings("aeiaaioooaauuaeiou");
        System.out.println(count);
    }
    public static int countVowelSubstrings(String S){
        int[] vowel = {0,0,0,0,0};
        int[] freq = new int[5];
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == 'a'){
                vowel[0]++;
            }else if(ch == 'e'){
                vowel[1]++;
            }else if(ch == 'i'){
                vowel[2]++;
            }else if(ch == 'o'){
                vowel[3]++;
            }else if(ch == 'u'){
                vowel[4]++;
            }
            for(int j = 0 ; j < 5; j++){
                freq[j] += vowel[j];
            }
        }
        return freq[0] + freq[1] + freq[2] + freq[3] + freq[4];
    }
}
                }
}