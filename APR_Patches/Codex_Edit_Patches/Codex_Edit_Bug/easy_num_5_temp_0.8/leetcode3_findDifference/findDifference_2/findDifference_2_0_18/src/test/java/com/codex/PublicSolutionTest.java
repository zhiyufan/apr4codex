package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int num1[]= {1, 2, 3};
        int num2[]= {2, 4, 6};
        List l1 = Arrays.asList(1, 3);
        List l2 = Arrays.asList(4, 6);
        List l3 = new ArrayList();
        l3.add(l1);
        l3.add(l2);
        assertEquals(findDifference(num1, num2), l3);
    }

    @Test(timeout=500)
    public void test2(){
        int num1[]= {1, 2, 3, 3};
        int num2[]= {1, 1, 2, 2};
        List l1 = Arrays.asList(3);
        List l2 = new ArrayList();
        List l3 = new ArrayList();
        l3.add(l1);
        l3.add(l2);
        assertEquals(findDifference(num1, num2), l3);
    }

}