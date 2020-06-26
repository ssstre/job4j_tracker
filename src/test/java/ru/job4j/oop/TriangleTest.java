package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest extends TestCase {

    @Test
    public void testPeriod() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertEquals(rsl, 8, 0.01);
    }
}