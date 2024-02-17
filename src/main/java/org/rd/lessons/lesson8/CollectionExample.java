package org.rd.lessons.lesson8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public CollectionExample() {
    }

    public static void main(String[] args) {
        List<String> liste = new ArrayList();
        new ArrayList();
        liste.add("Kırmızı");
        liste.add("Lacivert");
        liste.add("Sarı");
        liste.add(3, "Mor");
        liste.add(4, "lacivert");
        liste.add(3, "Beyaz");
        System.out.printf((String) liste.get(2) + " " + (String) liste.get(1));
        System.out.println();
        System.out.printf((String) liste.get(0) + " " + (String) liste.get(3));
        System.out.println();
        LinkedList<String> linkedList = new LinkedList();
        System.out.println();
        linkedList.add("Armut");
        linkedList.add("Elma");
        System.out.println((String) linkedList.get(0));
        System.out.println();
        HashSet<String> sets = new HashSet();
        sets.add("Kırmızı");
        sets.add("Sarı");
        sets.add("Yeşil");
        Iterator var5 = sets.iterator();

        while (var5.hasNext()) {
            String color = (String) var5.next();
            System.out.println(color);
        }

    }
}

