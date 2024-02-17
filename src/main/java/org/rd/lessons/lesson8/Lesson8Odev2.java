package org.rd.lessons.lesson8;

import java.util.HashSet;
import java.util.Set;

public class Lesson8Odev2 {
    public Lesson8Odev2() {
    }

    public static void main(String[] args) {
        String[] metin = new String[]{"1.ödvcümlesi", "2. ödev cümlesi", "3. ödv cüüüüümlesi", "4. ööööööödev cümlesi"};
        Set<Character> benzersizKarakterKumesi = new HashSet();

        for (int i = 0; i < metin.length; ++i) {
            System.out.println("Dizinin " + (i + 1) + ". elemani: " + metin[i]);
            if (hasRepeatingCharacters(metin[i])) {
                System.out.println("Bu cümle tekrar eden karakter içeriyor. Bu yüzden işlem sonlandırıldı.");
                break;
            }

            char[] var4 = metin[i].toCharArray();
            int var5 = var4.length;

            for (int var6 = 0; var6 < var5; ++var6) {
                char karakter = var4[var6];
                benzersizKarakterKumesi.add(karakter);
            }
        }

        System.out.println("Tekrar eden karakterlerin olmadığı karakter kümesi: " + benzersizKarakterKumesi);
    }

    public static boolean hasRepeatingCharacters(String cumle) {
        Set<Character> karakterSeti = new HashSet();
        char[] var2 = cumle.toLowerCase().toCharArray();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            char karakter = var2[var4];
            if (!karakterSeti.add(karakter)) {
                return true;
            }
        }

        return false;
    }
}
