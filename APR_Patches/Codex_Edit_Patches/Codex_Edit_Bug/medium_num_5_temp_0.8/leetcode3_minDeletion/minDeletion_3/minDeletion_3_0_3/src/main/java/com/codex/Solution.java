package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args){

String myString = "My name is abhay";
char[] charArray = myString.toCharArray();
Arrays.sort(charArray);
String sortedString = new String(charArray);
System.out.println("The sorted string is:" + sortedString);

}

    
}