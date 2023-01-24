package com.codex;

import java.util.*;

public class Solution {
public boolean isUnique(String str){
	if(str.length() > 128) return false;
	boolean[] char_set = new boolean[128];
	for(int i = 0; i < str.length(); i++){
		int value = str.charAt(i);
		if(char_set[value]){
			return false;
		}
		char_set[value] = true;
    }

	return true;
}
}