package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String arr[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        assertEquals(6, mostWordsFound(arr));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"please wait", "continue to fight", "continue to win"};
        assertEquals(3, mostWordsFound(arr));
    }


}