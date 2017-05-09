package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Root on 09.05.2017.
 */
public class PointTests {

    @Test
    public void testAreaHorizontal() {
        Point p1 = new Point(1.0,3.0);
        Point p2 = new Point(6.0,3.0);
        Assert.assertEquals(p1.distance(p2), 5.0);
    }

    @Test
    public void testAreaVertical() {
        Point p1 = new Point(2.0,2.0);
        Point p2 = new Point(2.0,8.0);
        Assert.assertEquals(p1.distance(p2), 6.0);
    }

    @Test
    public void testAreaDiagonal() {
        Point p1 = new Point(2.0,1.0);
        Point p2 = new Point(7.0,6.0);
        Assert.assertEquals(p1.distance(p2), 7.0710678118654755);
    }
}
