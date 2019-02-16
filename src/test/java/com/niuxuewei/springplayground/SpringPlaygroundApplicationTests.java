package com.niuxuewei.springplayground;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringPlaygroundApplicationTests {

    @Before
    public void testBefore() {
        System.out.println("Before");
    }

    @After
    public void testAfter() {
        System.out.println("After");
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void testOne() {
        System.out.println("test hello");
        TestCase.assertEquals(1, 1);
    }

}

