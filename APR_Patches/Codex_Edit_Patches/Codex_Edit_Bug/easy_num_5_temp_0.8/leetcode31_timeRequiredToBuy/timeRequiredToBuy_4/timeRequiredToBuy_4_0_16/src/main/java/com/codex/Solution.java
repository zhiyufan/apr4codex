package com.codex;

import java.util.*;

public class Solution {
/**
 * Author Mohammed S. Yaseen
 * 
 */

 /*
    This class implements a solution to the following problem:

    A movie theater only keeps a percentage of the revenue earned from ticket sales. 
    The rest goes to the movie distributor. For example, if a theater sells $10,000 
    of tickets over the weekend and keeps 10% of that as profit, the theater owes $9000 
    to the distributor. Write a program to determine how long it will take for a theater 
    to pay off its debt to the distributor.
    Note: this question is simplified for time constraints. Assume that there is only one 
    type of ticket that costs $10, and that this does not change.
    
    Input: There are two lines of input: the first line is a single number, n, that indicates 
    the number of weeks that have passed since the theater opened. The second line contains 
    n numbers (separated by spaces) indicating the number of tickets sold each week.

    Output: Print the number of weeks it will take for the theater to pay off its debt.

    Example:
    Input:
    3
    5 100 10

    Output:
    30
 */

public class MoviesDistributor{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tickets = new int[n];
        for(int i = 0; i < n; i++){
            tickets[i] = in.nextInt();
        }
        in.close();
        int result = timeRequiredToBuy(tickets, 10);
        System.out.println(result);

    }

    public static int timeRequiredToBuy(int[] tickets, int ticketPrice) {
        int debt = 0;
        int weeks = 0;
        for(int i = 0; i < tickets.length; i++){
            debt += tickets[i] * ticketPrice;
            debt -= tickets[i];
            weeks++;
            if(debt <= 0) break;
        }
        return weeks;
    }

}
}