package org.rd.lessons.lesson8;

import java.util.HashMap;

public class HashMaps {
    public HashMaps() {
    }

    public static void main(String[] args) {
        HashMap<String, String> renkler = new HashMap();
        renkler.put("R", "Red");
        renkler.put("G", "Green");
        renkler.put("B", "Blue");
        renkler.put("W", "White");
        System.out.println((String) renkler.get("R"));
        System.out.println((String) renkler.get("W"));
    }
}