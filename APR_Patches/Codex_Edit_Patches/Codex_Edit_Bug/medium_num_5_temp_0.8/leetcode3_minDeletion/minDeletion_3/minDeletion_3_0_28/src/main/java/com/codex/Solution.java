package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static void main(String args[])
    {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int a = 10,b=5;
        boolean flag = true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a && arr[i]==b)
            {
                flag = false;
                break;
            }
            else if(arr[i]==a || arr[i]==b)
            {
                continue;
            }
            else
            {
                flag = true;
            }
        }
        if(flag)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

}
}