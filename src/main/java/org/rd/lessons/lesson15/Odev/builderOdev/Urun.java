package org.rd.lessons.lesson15.Odev.builderOdev;

public class Urun {
    private String ad;
    private String kategori;
    private double fiyat;

    private Urun() {
    }

    public String getAd() {
        return ad;
    }
    public String getKategori() {
        return kategori;
    }
    public double getFiyat() {
        return fiyat;
    }

    public static class Olusturucu {
        private Urun urun;

        public Olusturucu() {
            urun = new Urun();
        }
        public Olusturucu adiAyarla(String ad) {
            urun.ad = ad;
            return this;
        }

        public Olusturucu kategoriAyarla(String kategori) {
            urun.kategori = kategori;
            return this;
        }

        public Olusturucu fiyatAyarla(double fiyat) {
            urun.fiyat = fiyat;
            return this;
        }

        public Urun olustur() {
            return urun;
        }
    }
}
