package com.codex;

import java.util.*;

public class Solution {
/**
 * https://codility.com/demo/results/demoH3JF7W-N6H/
 * 
 * You are given a string S consisting of N characters. The string represents a car route, and consists only of the characters
 * 'L', 'R', 'U', 'D'. The following car route:
 * 
 *          S[0] = "D"
 *          S[1] = "R"
 *          S[2] = "R"
 *          S[3] = "U"
 *          S[4] = "D"
 *          S[5] = "L"
 *          S[6] = "L"
 * 
 * will be represented as a square with a side length equal to 1 unit. The car starts in the bottom-left corner,
 * and can only move along the edges of the square, according to the given route.
 * 
 * 
 * During each move, the car moves from one square to another square, through a single corner. For example,
 * the route "DRRUUDLLLL" is represented by the following squares:
 * 
 * 
 * Your goal is to calculate the number of angles between the edges of the squares in the route.
 * The car moves only through corners.
 * For example, if we have the following square:
 * 
 * 
 * the answer to this route would be equal to 4, because a total of four angles are between the edges of the square.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int N, String S); }
 * 
 * that, given a non-empty zero-indexed string S of length N, representing a car route, and an integer N, returns the number
 * of routes the car has hit during its travel. The function should return 0 if the car starts outside the square.
 * 
 * For example, given N = 8 and S = "DRRUUDLLLL", the function should return 6, as the car has hit 6 routes in the following squares:
 * 
 * 
 * Given N = 2, and S = "LLDDR", the function should return 0.
 * 
 * The following squares are assumed to not exist:
 * 
 * Given N = 4, and S = "DUURDDDRR", the function should return 3.
 * 
 * Given N = 4, and S = "UURRDRDDD", the function should return 2.
 * 
 * Given N = 6, and S = "RRRRUURRDDRUURRDDRUURRDDRUURD", the function should return 8.
 * 
 * Assume that:
 * 
 * The string S is a non-empty string containing only the characters 'L', 'R', 'U', 'D'
 * N is an integer within the range [1..100,000]
 * Complexity:
 * 
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage
 * required for input arguments).
 * Elements of input arrays can be modified.
 * 
 * @author Marios
 *
 */

public class Instructions {

    public int solution(int n, String s) {
        
        int row = 0, col = 0;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            char direction = s.charAt(i);
            
            switch (direction) {
                case 'L': {
                    if (col > 0) {
                        col--;
                        count++;
                    }
                    break;
                }
                case 'R': {
                    if (col < n - 1) {
                        col++;
                        count++;
                    }
                    break;
                }
                case 'U': {
                    if (row > 0) {
                        row--;
                        count++;
                    }
                    break;
                }
                case 'D': {
                    if (row < n - 1) {
                        row++;
                        count++;
                    }
                    break;
                }
                default:
                    break;
            }
            answer[i] = count;
        }
        return answer;
    }

    
}