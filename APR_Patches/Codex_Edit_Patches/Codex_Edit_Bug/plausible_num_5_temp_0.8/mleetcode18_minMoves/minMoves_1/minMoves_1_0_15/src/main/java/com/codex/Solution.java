package com.codex;

import java.util.*;

public class Solution {
public class Answer{

    public static int minMoves(int target, int moves){
        if (target == 1) return moves;
        if (target % 2 == 0) return minMoves(target/2, moves+1);
        return minMoves(target+1, moves+1);
    }

    public static void main(String[] args){
       System.out.println(minMoves(7,0)); 
    }
}
}