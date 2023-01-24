package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String arr[] = {"3","6","7","10"};
        assertEquals("3", kthLargestNumber(arr,4));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"2","21","12","1"};
        assertEquals("2", kthLargestNumber(arr,3));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"0","0"};
        assertEquals("0", kthLargestNumber(arr,2));
    }

}