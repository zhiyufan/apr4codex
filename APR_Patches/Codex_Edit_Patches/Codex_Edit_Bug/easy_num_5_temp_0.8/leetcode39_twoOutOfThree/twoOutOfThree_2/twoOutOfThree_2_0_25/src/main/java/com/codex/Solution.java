package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            int k=in.nextInt();
            int pos=0;
            int neg=0;
            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    pos=pos+arr[i];
                }else{
                    neg=neg+arr[i];
                }
            }
            if(((pos-neg)>k)||(pos-neg)<0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        } 
    }

}
}