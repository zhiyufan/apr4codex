package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {5,3,3,3,5,6,2};
        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(2,3));
        assertEquals(lst, goodDaysToRobBank(arr, 2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,1,1,1,1};
        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
        assertEquals(lst, goodDaysToRobBank(arr, 0));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,2,3,4,5,6};
        List<Integer> lst = new ArrayList<Integer>();
        assertEquals(lst, goodDaysToRobBank(arr, 2));
    }
}