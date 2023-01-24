package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;
public class Test{
	public static String makeFancyString(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			char thisChar = s.charAt(i);
			if(i == 0){
				sb.append(thisChar);
			}
			else
			{
				char lastChar = sb.charAt(sb.length() - 1);
				char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length()-2):' ';
				if(lastChar != thisChar && lastLastChar != thisChar){
					sb.append(thisChar);
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = "";
		while(in.hasNextLine()){
			s += in.nextLine();
		}
		System.out.println(makeFancyString(s));
	}
}

    
}