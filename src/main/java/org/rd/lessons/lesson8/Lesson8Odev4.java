package org.rd.lessons.lesson8;

import java.util.HashSet;
import java.util.Set;

public class Lesson8Odev4 {
    public static void main(String[] args) {
        String[] metin = new String[]{"1.odvcummmmmlesi", "2. odev cumlesi", "3. odv cuuuuuuumlesi", "4. ooooooodev cumlesi"};
        Set<Character> tekrarEdenKarakterKumesi = new HashSet<>();

        for (String cumle : metin) {
            for (int i = 0; i < cumle.length(); i++) {
                char karakter = cumle.charAt(i);
                if (hasRepeatingCharacters(cumle.substring(i + 1), karakter)) {
                    tekrarEdenKarakterKumesi.add(karakter);
                }
            }
        }

        StringBuilder tekrarEdenKarakterMetni = new StringBuilder();
        for (char karakter : tekrarEdenKarakterKumesi) {
            tekrarEdenKarakterMetni.append(karakter);
        }

        System.out.println("Tekrar eden karakterlerden olusan metin: " + tekrarEdenKarakterMetni.toString());
    }

    public static boolean hasRepeatingCharacters(String str, char c) {
        return str.indexOf(c) != -1;
    }
}
