package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;

public class PointTest extends TestCase {

    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(dist, 2, 0.01);

    }
}