package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int first = 1;
        int second = 2;
        int expected = 2;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void testMax() {
        int first = 1;
        int second = 4;
        int third = 2;
        int expected = 4;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void testMax1() {
        int first = 1;
        int second = 4;
        int third = 2;
        int fourth = 3;
        int expected = 4;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, out);
    }
}