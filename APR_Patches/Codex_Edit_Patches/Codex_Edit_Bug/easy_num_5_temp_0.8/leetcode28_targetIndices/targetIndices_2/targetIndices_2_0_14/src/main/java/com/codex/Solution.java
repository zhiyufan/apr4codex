package com.codex;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello" ;
		String str2 = "Hell";
		
		String str3 = str1.substring(0,4);
		String str4 = str2.substring(0,4);
		
		System.out.println("str1: " + str1 );
		System.out.println("str2: " + str2 );
		
		System.out.println("str1 == str2 : " + (str1==str2));
		System.out.println("str3 == str4 : " + (str3==str4));
		System.out.println("str3 == str2 : " + (str3==str2));

		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println("str3.equals(str4) : " + (str3.equals(str4)));
		System.out.println("str3.equals(str2) : " + (str3.equals(str2)));
		System.out.println("str1.equals(str4) : " + (str1.equals(str4)));
		
		str1 = str1.substring(0,4);
		System.out.println("str1: " + str1 );
		System.out.println("str2: " + str2 );
		
		System.out.println("str1 == str2 : " + (str1==str2));
		System.out.println("str3 == str4 : " + (str3==str4));
		System.out.println("str3 == str2 : " + (str3==str2));

		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println("str3.equals(str4) : " + (str3.equals(str4)));
		System.out.println("str3.equals(str2) : " + (str3.equals(str2)));
		System.out.println("str1.equals(str4) : " + (str1.equals(str4)));

    }
}
}