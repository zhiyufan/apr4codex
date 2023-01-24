package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        List<String> theStrings = new ArrayList<String>();
        for (int i = 0; i < n; i++)
        {
           String theString = in.nextLine();
           theStrings.add(theString);
        }

        for (String theString : theStrings) {
            System.out.println(getNumbers(theString));
        }
    }


    public static String getNumbers(String theString)
    {
        int theLength = theString.length();
        int rightIndex = theLength - 1;
        int leftIndex = 0;
        while(leftIndex <= rightIndex)
        {
            char leftCharacter = theString.charAt(leftIndex);
            char rightCharacter = theString.charAt(rightIndex);
            if(leftCharacter == ' ' && rightCharacter == ' ')
            {
                leftIndex++;
                rightIndex--;
            }
            if(leftCharacter != ' ' && rightCharacter == ' ')
            {
                rightIndex--;
            }
            if(leftCharacter == ' ' && rightCharacter != ' ')
            {
                leftIndex++;
            }
            if(leftCharacter != ' ' && rightCharacter != ' ')
            {
                leftIndex++;
                rightIndex--;
            }

            //System.out.println("leftIndex: " + leftIndex + " rightIndex: " + rightIndex);

        }

        return theString.substring(leftIndex, rightIndex+1);
    }
}
}