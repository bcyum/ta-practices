package org.rd.lessons.lesson8;

public class Arrays1 {
    public Arrays1() {
    }

    public static void main(String[] args) {
        int[] sayilar = new int[]{10, 20, 30, 40, 0};
        int ikinciEleman = sayilar[1];

        for (int i = 0; i < sayilar.length; ++i) {
            System.out.println("Dizinin " + (i + 1) + ". elemani: " + sayilar[i]);
        }

    }
}