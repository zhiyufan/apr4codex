package com.codex;

import java.util.*;

public class Solution {
    class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            Set<Integer> set = new HashSet<>();
            int row = startPos[0], col = startPos[1];
            set.add(row * n + col);

            char[] directions = s.substring(i).toCharArray(); //make a char array of the string
            for (int j = 0; j < directions.length; j++) { //loop through the directions array
                switch (directions[j]) { //add a case for each possible direction
                    case 'L':
                        if (col > 0) //if we are not at the left boarder
                            col--;   //consider the left adjasent square
                        break;
                    case 'R':
                        if (col < n - 1) //if we are not at the right boarder
                            col++;      //consider the right adjasent square
                        break;
                    case 'U':
                        if (row > 0) //if we are not at the top boarder
                            row--;     //consider the top adjasent square
                        break;
                    case 'D':
                        if (row < n - 1) //if we are not at the bottom boarder
                            row++;      //consider the bottom adjasent square
                        break;
                }
                set.add(row * n + col); //add the position to the set
            }
            answer[i] = set.size();  //set the answer for the index i to size of set
        }
        return answer;
    }

}
}