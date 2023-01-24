package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        assertEquals(convertTime("02:30","04:35"), 3);
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(convertTime("11:00","11:01"), 1);
    }

}