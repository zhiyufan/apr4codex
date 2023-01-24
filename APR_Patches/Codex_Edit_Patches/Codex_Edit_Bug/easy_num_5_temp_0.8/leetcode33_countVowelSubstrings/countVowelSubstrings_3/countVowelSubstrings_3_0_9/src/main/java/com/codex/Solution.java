package com.codex;

import java.util.*;

public class Solution {
    #include <bits/stdc++.h>
using namespace std;
int main() {
	//code
	int t;
	cin >> t;
	while(t--){
	    int n;
	    cin >> n;
	    int arr[n];
	    for(int i = 0 ; i < n ; i++) cin >> arr[i];
	    int k;
	    cin >> k;
	    int p = 0;
	    while(p < n){
	        int curr = arr[p];
	        if(arr[p] <= k){
	            p++;
	        }
	        else{
	            int j = k;
	            int i = p;
	            for( ; j >= 0 ; j--){
	                if(arr[p] > j){
	                    i = p;
	                    p++;
	                }
	                else{
	                    arr[i] = arr[p];
	                    i++;
	                }
	            }
	            while(j >= 0){
	                arr[i] = j;
	                i++;
	                j--;
	            }
	            break;
	        }
	    }
	    for(int i = 0 ; i < n ; i++) cout << arr[i] << " ";
	    cout << endl;
	}
	return 0;
}
}