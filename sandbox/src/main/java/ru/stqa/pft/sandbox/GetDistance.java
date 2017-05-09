package ru.stqa.pft.sandbox;

/**
 * Created by Root on 09.05.2017.
 */
public class GetDistance {

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 4.0;
        p1.y = 6.0;

        Point p2 = new Point();
        p2.x = 5.0;
        p2.y = 7.0;

        System.out.println("Расстояние между точками с координатами (" + p1.x + ", " + p1.y + ")" + " и " + "(" + p2.x + ", " + p2.y + ")" + " = " + distance(p1, p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
    }
}
