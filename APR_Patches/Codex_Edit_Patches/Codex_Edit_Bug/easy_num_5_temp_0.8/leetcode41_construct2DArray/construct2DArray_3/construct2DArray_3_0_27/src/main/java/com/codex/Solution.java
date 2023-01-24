package com.codex;

import java.util.*;

public class Solution {
// C++ program to print all combination of size r in 
// an array of size n. This program prints the 
// combinations in lexicographic sorted order 
#include <bits/stdc++.h> 
using namespace std; 
  
// The main function that prints all combinations of size r 
// in arr[] of size n. This function mainly uses combinationUtil() 
void printCombination(int arr[], int n, int r) 
{ 
    int data[r]; 
  
    // Print all combination using temprary array 'data[]' 
    combinationUtil(arr, 0, n - 1, 0, r, data, 0); 
} 
  
/* arr[]  ---> Input Array 
n      ---> Size of input array 
index  ---> Current index in data[] 
r      ---> Size of a combination to be printed 
data[] ---> Temporary array to store current combination 
i      ---> index of current element in arr[] */
void combinationUtil(int arr[], int start, int end, int index, int r, 
                     int data[], int i) 
{ 
    // Current combination is ready, print it 
    if (index == r) { 
        for (int j = 0; j < r; j++) 
            cout << data[j] << " "; 
        cout << endl; 
        return; 
    } 
  
    // replace index with all possible elements. The condition 
    // "end-i+1 >= r-index" makes sure that including one element 
    // at index will make a combination with remaining elements 
    // at remaining positions 
    for (int i=start; i<=end && end-i+1 >= r-index; i++) 
    { 
        data[index] = arr[i]; 
        combinationUtil(arr, i + 1, end, index + 1, r, data, 0); 
    } 
} 
  
// Driver code 
int main() 
{ 
    int arr[] = { 1, 2, 3, 4, 5 }; 
    int r = 3; 
    int n = sizeof(arr) / sizeof(arr[0]); 
    printCombination(arr, n, r); 
} 
  
// This code is contributed by rathbhupendra 




int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int r = 3;
    int n = sizeof(arr) / sizeof(arr[0]);
    printCombination(arr, n, r);
}

void combine(int arr[], int data[], int start, int end,
             int index, int r)
{
    // Current combination is ready to be printed, print it
    if (index == r)
    {
        for (int j = 0; j < r; j++)
            printf("%d ", data[j]);
        printf("\n");
        return;
        }

    // replace index with all possible elements. The condition
    // "end-i+1 >= r-index" makes sure that including one element
    // at index will make a combination with remaining elements
    // at remaining positions
    for (int i = start; i <= end && end - i + 1 >= r - index; i++)
    {
        data[index] = arr[i];
        combine(arr, data, i + 1, end, index + 1, r);
    }

}

// The main function that prints all combinations of size r
// in arr[] of size n. This function mainly uses combine()
void printCombination(int arr[], int n, int r)
{
    // A temporary array to store all combination one by one
    int data[r];

    // Print all combination using temprary array 'data[]'
    combine(arr, data, 0, n - 1, 0, r);
}
}