package org.rd.lessons.lesson9;

public class NesneAktarmaOrnek {
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci("Ahmet", 20);


        System.out.println("Orijinal Ogrenci Bilgileri: " + ogrenci.getAd() + ", " + ogrenci.getYas());
        degisiklikYap(ogrenci);
    }

    public static void degisiklikYap(Ogrenci ogrenci) {
        ogrenci.setAd("Mehmet");
        ogrenci.setYas(22);
        System.out.println("Metot İçindeki Ogrenci Bilgileri: " + ogrenci.getAd() + ", " + ogrenci.getYas());
    }
}

