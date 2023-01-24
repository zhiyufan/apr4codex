package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String str = "H..H";
        assertEquals(2, minimumBuckets(str));
    }

    @Test(timeout=500)
    public void test2(){
        String str = ".H.H.";
        assertEquals(1, minimumBuckets(str));
    }

    @Test(timeout=500)
    public void test3(){
        String str = ".HHH.";
        assertEquals(-1, minimumBuckets(str));
    }
}