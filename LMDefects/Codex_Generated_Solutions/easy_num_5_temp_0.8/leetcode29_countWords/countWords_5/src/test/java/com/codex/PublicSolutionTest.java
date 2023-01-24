package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String arr[] = {"leetcode","is","amazing","as","is"};
        String arr2[] = {"amazing","leetcode","is"};
        assertEquals(2, countWords(arr, arr2));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"b","bb","bbb"};
        String arr2[] = {"a","aa","aaa"};
        assertEquals(0, countWords(arr, arr2));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"a","ab"};
        String arr2[] = {"a","a","a","ab"};
        assertEquals(1, countWords(arr, arr2));
    }
}