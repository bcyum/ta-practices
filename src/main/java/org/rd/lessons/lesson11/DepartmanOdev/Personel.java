package org.rd.lessons.lesson11.DepartmanOdev;

public abstract class Personel {
    protected String ad;
    protected String soyad;
    protected String doğumTarihi;

    public Personel(String ad, String soyad, String doğumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.doğumTarihi = doğumTarihi;
    }

    public String getTamAd() {
        return ad + " " + soyad;
    }

    public abstract void emeklilikYasiHesapla();
}
