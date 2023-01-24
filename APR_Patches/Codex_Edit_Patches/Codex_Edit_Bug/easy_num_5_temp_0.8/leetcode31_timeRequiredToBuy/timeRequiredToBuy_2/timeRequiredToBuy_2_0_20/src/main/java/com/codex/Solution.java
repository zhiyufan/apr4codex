package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Main
{
	public static void main(String[] args) {


	    int[] tickets = {2,6,3,4,5};
	    int k = 2;
	    int result = timeRequiredToBuy(tickets,k);
	    System.out.println(result);
	    
	    
	}
	

public static int timeRequiredToBuy(int[] tickets, int k) {
        Arrays.sort(tickets);
        int total = 0;
        for (int i = 0; i < k; i++) {
            if (tickets[i] < tickets[k]) {
                total += tickets[i];
            } else {
                total += tickets[k];
            }
        }
        return total;
    }

}
    
}