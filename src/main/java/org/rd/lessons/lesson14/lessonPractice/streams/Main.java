package org.rd.lessons.lesson14.lessonPractice.streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Örnek 1
       List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sayilar.stream()
                .filter(num -> num % 2 == 0)
                .skip(2)
                .forEach(System.out::println);


        // Örnek 2
        List<String> isimler = Arrays.asList("ahmet", "bekir", "can");
        String bulunan = isimler.stream()
                //.filter(isim -> isim.contains("a")).forEach(System.out::println);
                .filter(isim -> isim.equals("can")).findFirst().orElse("Bulunamadı");

        if (!bulunan.equals("Bulunamadı"))
            System.out.println("Bulunan: "+ bulunan);
        else System.out.println(bulunan);
    }

}