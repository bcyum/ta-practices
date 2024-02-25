package org.rd.lessons.lesson11.DepartmanOdev;

public class Erkek extends Personel {
    public Erkek(String ad, String soyad, String doğumTarihi) {
        super(ad, soyad, doğumTarihi);
    }

    @Override
    public void emeklilikYasiHesapla() {
        System.out.println("Erkeklerin emeklilik yaşı 65'tir.");
    }
}