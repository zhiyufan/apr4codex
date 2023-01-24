package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        String arr[] = {"a","abc","bc","d"};
        String str = "abc";
        assertEquals(3, numOfStrings(arr, str));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"a","b","c"};
        String str = "aaaaabbbbb";
        assertEquals(2, numOfStrings(arr, str));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"a","a","a"};
        String str = "ab";
        assertEquals(3, numOfStrings(arr, str));
    }

}