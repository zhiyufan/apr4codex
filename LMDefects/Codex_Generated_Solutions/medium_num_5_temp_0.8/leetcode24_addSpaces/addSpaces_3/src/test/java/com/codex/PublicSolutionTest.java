package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String str = "LeetcodeHelpsMeLearn";
        int arr[] = {8,13,15};
        assertEquals("Leetcode Helps Me Learn", addSpaces(str, arr));
    }

    @Test(timeout=500)
    public void test2(){
        String str = "icodeinpython";
        int arr[] = {1,5,7,9};
        assertEquals("i code in py thon", addSpaces(str, arr));
    }

    @Test(timeout=500)
    public void test3(){
        String str = "spacing";
        int arr[] = {0,1,2,3,4,5,6};
        assertEquals(" s p a c i n g", addSpaces(str, arr));
    }
}