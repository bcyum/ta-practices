package org.rd.lessons.lesson8;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapOzelSinif {
    public HashMapOzelSinif() {
    }

    public static void main(String[] args) {
        HashMap<Integer, Ogrenci> ogrenciMap = new HashMap();
        ogrenciMap.put(1, new Ogrenci("Ali", 20));
        ogrenciMap.put(2, new Ogrenci("Ayse", 19));
        ogrenciMap.put(3, new Ogrenci("Ahmet", 27));
        Ogrenci Ali = (Ogrenci) ogrenciMap.get(1);
        System.out.println("1 numaralı ogrencimizin adi: " + Ali.ad + "yasi: " + Ali.yas);
        Iterator var3 = ogrenciMap.keySet().iterator();

        while (var3.hasNext()) {
            int numara = (Integer) var3.next();
            Ogrenci ogrenci = (Ogrenci) ogrenciMap.get(numara);
            System.out.println("" + numara + " -> " + ogrenci.ad + ", " + ogrenci.yas + " yasinda!");
        }

    }
}