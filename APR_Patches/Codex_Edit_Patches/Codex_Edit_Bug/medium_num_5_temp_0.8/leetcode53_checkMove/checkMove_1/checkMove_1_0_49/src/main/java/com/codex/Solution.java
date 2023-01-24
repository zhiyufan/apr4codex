package com.codex;

import java.util.*;

public class Solution {
public class Board {
    char[][] board;
    public Board() {
        board=new char[8][8];
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(i%2==0) {
                    if(j%2==0) {
                        if(i<3)board[i][j]='B';
                        else if(i>4)board[i][j]='R';
                    }
                    else board[i][j]='.';
                }
                else {
                    if(j%2==1) {
                        if(i<3)board[i][j]='B';
                        else if(i>4)board[i][j]='R';
                    }
                    else board[i][j]='.';
                }
            }
        }
        return isEligible;
    }

    

    
}