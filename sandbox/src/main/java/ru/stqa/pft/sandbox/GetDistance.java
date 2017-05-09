package ru.stqa.pft.sandbox;

/**
 * Created by Root on 09.05.2017.
 */
public class GetDistance {

    public static void main(String[] args) {

        Point p1 = new Point(4.0,6.0);
        Point p2 = new Point(5.0,7.0);

        System.out.println("Расстояние между точками с координатами (" + p1.x + ", " + p1.y + ")" + " и " + "(" + p2.x + ", " + p2.y + ")" + " = " + p1.distance(p2));
    }


}
