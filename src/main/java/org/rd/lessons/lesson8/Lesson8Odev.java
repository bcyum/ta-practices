package org.rd.lessons.lesson8;

import java.util.HashSet;
import java.util.Set;

public class Lesson8Odev {
    public Lesson8Odev() {
    }

    public static void main(String[] args) {
        String[] metin = new String[]{"1.ödvcümlesi", "2. ödev cümlesi", "3. ödv cüüüüümlesi", "4. öööööödev cümlesi"};

        for (int i = 0; i < metin.length; ++i) {
            System.out.println("Dizinin " + (i + 1) + ". elemani: " + metin[i]);
            Set<Character> tekrarEdenKarakter = findRepeatingCharacters(metin[i]);
            if (!tekrarEdenKarakter.isEmpty()) {
                System.out.println("Cümle tekrar eden karakter içeriyor. Tekrar eden karakterler: " + tekrarEdenKarakter);
                String tekrarEdenKelime = createRepeatingWord(tekrarEdenKarakter);
                System.out.println("Tekrar eden karakterlerden oluşturulan kelime: " + tekrarEdenKelime);
            } else {
                System.out.println("Cümle tekrar eden karakter içermiyor");
            }
            System.out.println();
        }
    }

    public static Set<Character> findRepeatingCharacters(String cumle) {
        Set<Character> karakterSeti = new HashSet<>();
        Set<Character> tekrarEdenKarakter = new HashSet<>();
        char[] charArray = cumle.toLowerCase().toCharArray();

        for (char karakter : charArray) {
            if (!karakterSeti.add(karakter)) {
                tekrarEdenKarakter.add(karakter);
            }
        }
        return tekrarEdenKarakter;
    }

    public static String createRepeatingWord(Set<Character> characters) {
        StringBuilder kelime = new StringBuilder();
        for (Character karakter : characters) {
            kelime.append(karakter);
        }
        return kelime.toString();
    }
}
