package org.rd.lessons.lesson10.GezegenOdev;

import org.rd.lessons.lesson10.EnumOrnek;

public class GezegenTest3 {
    public enum Gezegenler {
        MERKUR, VENUS, DUNYA, MARS, JUPITER, SATURN, URANUS, NEPTUN, PLUTON
    }
    public static void main(String[] args) {
        Gezegenler[] gezegenler = Gezegenler.values();

        for (int i = 0; i < gezegenler.length; i++) {
            System.out.print(gezegenler[i]);
            if (i < gezegenler.length - 1) {
                System.out.print(", ");
            }
        }
    }
}