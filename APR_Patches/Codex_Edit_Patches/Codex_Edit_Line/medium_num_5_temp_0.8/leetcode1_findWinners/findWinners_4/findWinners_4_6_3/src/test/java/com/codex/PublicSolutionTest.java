package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}
        };
        List l1 = Arrays.asList(1, 2, 10);
        List l2 = Arrays.asList(4, 5, 7, 8);
        List l3 = new ArrayList();
        l3.add(l1);
        l3.add(l2);
        assertEquals(findWinners(arr), l3);
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {2,3}, {1,3},
            {5,4}, {6,4}
        };
        List l1 = Arrays.asList(1, 2, 5, 6);
        List l2 = new ArrayList();
        List l3 = new ArrayList();
        l3.add(l1);
        l3.add(l2);
        assertEquals(findWinners(arr), l3);
    }

}