package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String arr[] = {"777","7","77","77"};
        assertEquals(4, numOfPairs(arr, "7777"));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"123","4","12","34"};
        assertEquals(2, numOfPairs(arr, "1234"));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"1","1","1"};
        assertEquals(6, numOfPairs(arr, "11"));
    }
}