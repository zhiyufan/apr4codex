package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String arr[] = {"d","b","c","b","c","a"};
        assertEquals("a", kthDistinct(arr, 2));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"aaa","aa","a"};
        assertEquals("aaa", kthDistinct(arr, 1));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"a","b","a"};
        assertEquals("", kthDistinct(arr, 3));
    }

}