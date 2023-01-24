package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'B' || colors.charAt(colors.length() - 1) == 'B') {
            return false;
        } else {
            return isWinningPossibility(colors);
        }
    }

    private static boolean isWinningPossibility(String colors) {
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'B' || colors.charAt(colors.length() - 1) == 'B') {
            return false;
        }

        StringBuilder sb = new StringBuilder(colors);
        int index = 0;
        while (index + 2 < sb.length()) {
            char start = sb.charAt(index);
            char mid = sb.charAt(index + 1);
            char end = sb.charAt(index + 2);
            if (start == mid && mid == end) {
                sb.deleteCharAt(index + 1);
                index = index + 1;
            } else {
                index++;
            }
        }



var abc={a:'',b:''};
var xyz={a:'c',b:'d',c:'b'};

function bfs(xyz,start,end){
    var visited={};
    var queue=[];
    var next;
    queue.push(abc[start]);
    while(queue.length!=0){
        next=queue.shift();
        if(next===end){
            return true;
        }
        else{
            if(xyz[next]){
                var adj=xyz[next];
                for(var i=0;i<adj.length;i++){
                    if(!visited[next]){
                        queue.push(adj[i]);
                    }
                }
            }
        }
    }
    return false;
}
        return isWinningPossibility(sb.toString());
    }
}