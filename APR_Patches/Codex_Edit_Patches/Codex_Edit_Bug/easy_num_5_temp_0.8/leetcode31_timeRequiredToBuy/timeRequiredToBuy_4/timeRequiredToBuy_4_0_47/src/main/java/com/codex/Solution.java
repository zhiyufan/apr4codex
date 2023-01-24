package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < tickets.length; i++){
            queue.add(tickets[i]);
        }
        int seconds = 0;
        while(!queue.isEmpty()){
            int person = queue.remove();
            if(person == 0) continue;
            if(k == 0) {
                seconds += person;
                queue.add(person);
                k = queue.size() - 1;
            }
            else{
                queue.add(person - 1);
                seconds++;
                k--;
            }
        }
        return seconds;
    }
You have  types of coins available in infinite quantities where the value of each coin is given in the array . Can you determine the number of ways of making change for  units using the given types of coins? For example, if , and , we can make change for  units in three ways: , , and .

Given , , and , print  as output.

Function Description

Complete the getWays function in the editor below. It must return an integer denoting the number of ways to make change.

getWays has the following parameter(s):

    n: an integer, the amount to make change for
    c: an array of integers representing available denominations

Input Format

The first line contains two space-separated integers describing the respective values of  and , where:

    is the number of units
    is the number of coin types
    The second line contains  space-separated integers describing the respective values of each coin type :  (the list of distinct coins available in infinite amounts).

Constraints

Each  is guaranteed to be distinct.
Hints

Solve overlapping subproblems using Dynamic Programming (DP):
You can solve this problem recursively but will not pass all the test cases without optimizing to eliminate the overlapping subproblems. Think of a way to store and reference previously computed solutions to avoid solving the same subproblem multiple times. * Consider the degenerate cases:
- How many ways can you make change for  cents? - How many ways can you make change for  cents if you have no coins?
If you're having trouble defining your solutions store, then think about it in terms of the base case . - The answer may be larger than a -bit integer.

Output Format

Print a long integer denoting the number of ways we can get a sum of  from the given infinite supply of  types of coins.

Sample Input 0

4 3
1 2 3

Sample Output 0

4

Sample Input 1

10 4
2 5 3 6

Sample Output 1

5

Explanation

Sample Case 0:

There are four ways to make change for  units using coins with values given by :

    Thus, we print  as our answer.

Sample Case 1:

There are five ways to make change for  units using coins with values given by :

Thus, we print  as our answer.




    public static long getWays(long n, long[] c){
        // Complete this function
        long[][] dyn = new long[(int)n+1][c.length+1];
        Arrays.fill(dyn[0], 1);
        for(int i = 1; i < c.length+1; i++){
            for(int j = 1; j < n+1; j++){
                long temp = 0;
                long temp2 = 0;
                if(i-1 < 0)
                    temp = 0;
                else
                    temp = dyn[j][i-1];
                if(j-c[i-1] < 0)
                    temp2 = 0;
                else
                    temp2 = dyn[(int)(j-c[i-1])][i];
                
                dyn[j][i] = temp + temp2;
            }
        }
        return dyn[(int)n][c.length];
    }



    
}