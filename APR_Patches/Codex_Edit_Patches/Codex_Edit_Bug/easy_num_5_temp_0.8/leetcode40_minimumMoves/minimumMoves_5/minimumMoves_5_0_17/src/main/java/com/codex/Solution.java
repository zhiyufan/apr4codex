package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {

    }
    int getMinute(List<Integer> a){
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<a.size();i++){
            int value=a.get(i);
            if(hash.containsKey(value)){
                hash.replace(value,hash.get(value)+1);
            }else{
                hash.put(value,1);
            }
        }
        int maxKey=0,maxValue=0;
        for(Map.Entry m:hash.entrySet()){
            if((int)m.getValue()>maxKey){
                maxKey=(int)m.getValue();
                maxValue=(int)m.getKey();
            }
        }
        int min=0;
        for(int i=0;i<maxKey;i++){
            min+=a.get(i);
        }
        int k=maxKey;
        for(int i=k;i<a.size();i++){
            if(a.get(i)<maxValue){
                min+=a.get(i);
            }else{
                k=i+1;
            }
        }
        return min;
    }

}
}