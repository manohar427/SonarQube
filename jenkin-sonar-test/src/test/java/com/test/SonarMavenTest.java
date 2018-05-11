package com.test;

import org.junit.Assert;
import org.junit.jupiter.api.*;

public class SonarMavenTest {

    @Test
    public void testPrintHelloWorld() {
        Assert.assertEquals(SonarMaven.getHelloWorld(), "Hello World");
    }

    @Test
    public void testPrintHelloWorld2() {
        Assert.assertEquals(SonarMaven.getHelloWorld2(), "Hello World 2");
    }

    @Test
    public void testPrintHelloWorld3() {
        Assert.assertEquals(SonarMaven.getHelloWorld3(), "Hello World 3");
    }
}
