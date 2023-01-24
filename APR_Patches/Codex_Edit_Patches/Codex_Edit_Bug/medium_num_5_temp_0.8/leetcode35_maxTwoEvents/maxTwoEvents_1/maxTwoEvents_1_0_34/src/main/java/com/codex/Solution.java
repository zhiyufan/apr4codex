package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(5);
        n.next.next.next.next.next = new Node(6);
        n.next.next.next.next.next.next = new Node(7);
        n.next.next.next.next.next.next.next = new Node(8);
        n.next.next.next.next.next.next.next.next = new Node(9);
        n.next.next.next.next.next.next.next.next.next = new Node(10);
        printList(n);
        Node res = swapNode(n, 3, 6);
        System.out.println("After Swapping");
        printList(res);
    }

    static Node swapNode(Node head, int x, int y){
        Node px=head;
        Node py=head;
        Node prex = null;
        Node prey = null;
        while(px!=null && py!=null){
            if(px.data == x || py.data == y) break;
            prex = px;
            prey = py;
            px = px.next;
            py = py.next;
        }
        if(px == null || py == null) return head;
        if(prex == null){
            Node temp = py;
            while(temp.next != px) temp = temp.next;
            temp.next = px.next;
            px.next = py.next;
            py.next = px;
            return py;
        }
        else{
            prex.next = py;
            prey.next = px;
            Node temp = px.next;
            px.next = py.next;
            py.next = temp;
            return head;
        }

    }
    static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
}