package com.codex;

import java.util.*;

public class Solution {
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy=new ListNode(-1);
        ListNode l3=dummy;
        int remainder=0;
        while(l1!=null || l2!=null){
            int x= (l1!=null) ? l1.val:0;
            int y= (l2!=null) ? l2.val:0;

            int sum= x+y+remainder;

            remainder=sum/10;

            l3.next=new ListNode(sum%10);
            l3=l3.next;

            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(remainder>0){
            l3.next=new ListNode(remainder);
        }
        return dummy.next;
    }


    public static void main(String[] args){

        ListNode l1=new ListNode(5);
        ListNode l2=new ListNode(5);
        ListNode l3=addTwoNumbers(l1,l2);
        while(l3!=null){
            System.out.println(l3.val);
            l3=l3.next;
        }
    }
}
}