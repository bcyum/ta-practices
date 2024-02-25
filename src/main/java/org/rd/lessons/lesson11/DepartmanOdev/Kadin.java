package org.rd.lessons.lesson11.DepartmanOdev;

public class Kadin extends Personel {
    public Kadin(String ad, String soyad, String doğumTarihi) {
        super(ad, soyad, doğumTarihi);
    }

    @Override
    public void emeklilikYasiHesapla() {
        System.out.println("Kadınların emeklilik yaşı 60'tır.");
    }
}