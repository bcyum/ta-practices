package org.rd.lessons.lesson5;

public class Araba {
    String marka;
    String model;
    String renk;
    int hiz;

    public void calistir() {
        System.out.println(marka + " arabasi calistirildi.");
    }
    public void durdur () {
        System.out.println(marka + " arabasi durduruldu.");
    }
    public void hizlan (int artis) {
        hiz += artis;
        System.out.println(marka + " arabasi " + artis + " km/s hizlandi.");
    }
}