package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String w=scan.nextLine();
        List<Character> letters = new ArrayList<>(Arrays.asList('1','2','3','4','5','6','7','8','9','0'));
        String [] num=w.split(" ");
        String word="";
        for(int i=0;i<num.length;i++){
            num[i]=num[i].toLowerCase();
            int index=letters.indexOf(num[i].charAt(0));
            char letter=letters.get(index-1);
            for(int j=1;j<num[i].length();j++){
                word+=num[i].charAt(j);
            }
            word+=letter;
            if(i!=num.length-1){
            word+=" ";
            }         
        }
}
        System.out.println(word);
    }
}