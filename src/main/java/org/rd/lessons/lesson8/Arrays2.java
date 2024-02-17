package org.rd.lessons.lesson8;

public class Arrays2 {
    public Arrays2() {
    }

    public static void main(String[] args) {
        String[] sayilar = new String[5];

        for (int i = 0; i < sayilar.length; ++i) {
            System.out.println("Dizinin " + (i + 1) + ". elemani: " + sayilar[i]);
        }

    }
}