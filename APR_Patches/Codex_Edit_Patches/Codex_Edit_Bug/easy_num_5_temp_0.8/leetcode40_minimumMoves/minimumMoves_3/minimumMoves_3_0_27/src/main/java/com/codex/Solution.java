package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {
        if(s.matches("[O]*")){ //Short circuit, if all are O then we are already done
            return 0;
        }
        int move = 0;
        String[] sArr = s.split("");
        int end = sArr.length - 1;
        //If the first and last characters are zero and all the characters in between are ones
        //Then we can simply count the number of times we can concatenate OXO
        //So we just have to move the number of times left of the length of array - 2
        if(sArr[0].equals("O") && sArr[1].equals("X") && sArr[end].equals("O")){
            for(int i = 2; i < sArr.length - 1; i++){
                if(sArr[i].equals("O")){
                    return 0;
                }
            }
            return sArr.length - 2;
        }
        //Now if all the characters in the array are ones, then we can just replace them with
        //XXXOOO and it will always be replaced with OOOXXX
        //So just find the number of times we can concatenate XXXOOO
        //then just move that many times
        boolean allOnes = true;
        for(String str : sArr){
            if(!str.equals("X")){
                allOnes = false;
            }
        }
        if(allOnes){
            return (sArr.length/5)*3;
        }
        //If the first and last characters are zeros and all the characters in between are ones
        //Then we can always move in such a way that the zeros are in the middle
        //And we can perform OXO or XOX operation
        //So we just have to move the number of times left of the length of array - 2
        if(sArr[0].equals("O") && sArr[1].equals("X") && sArr[end].equals("X")){
            for(int i = 2; i < sArr.length - 1; i++){
                if(sArr[i].equals("O")){
                    return 0;
                }
            }
            return sArr.length - 2;
        }
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i].equals("X")){
                move++;
                if(sArr[i+1] != null && sArr[i + 1].equals("X")){
                    move++;
                    sArr[i] = "O";
                    sArr[i+1] = "O";
                }else{
                    sArr[i] = "O";
                }
            }
        }
        return move;
    }
}