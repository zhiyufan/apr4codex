package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {1, 2, 3, 4, 5};
        assertEquals(triangularSum(arr), 8);
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {5};
        assertEquals(triangularSum(arr), 5);
    }

}