package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {2,3,2};
        assertEquals(6, timeRequiredToBuy(arr, 2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {5,1,1,1};
        assertEquals(8, timeRequiredToBuy(arr, 0));
    }

}