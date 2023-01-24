package com.codex;

import java.util.*;

public class Solution {
#include<stdio.h>
#include<stdlib.h>


int main( int argc, char** argv)
{
	int myArray[] = {1, 5, 10, 50, 100, 500};

	int length = sizeof(myArray) / sizeof(myArray[0]);
	
	if ( length == 0)
	{
		printf("No elements");
	}

	//max element
	int maxElement = myArray[length -1];

	//min element
	int minElement = myArray[0];

	printf("Max is %d\n", maxElement);
	printf("Min is %d\n", minElement);




    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Arrays.sort(tickets);
        int total = 0;
        for (int i = 0; i <= k; i++) {
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