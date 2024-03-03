package org.rd.lessons.lesson15.Odev.builderOdev;

public class BuilderOdevTest {
    public static void main(String[] args) {

        Urun olusturulanUrun = new Urun.Olusturucu()
                .adiAyarla("Bilgisayar")
                .kategoriAyarla("Elektronik")
                .fiyatAyarla(25000)
                .olustur();

        System.out.println("Oluşturulan Ürün:");
        System.out.println("Ad: " + olusturulanUrun.getAd());
        System.out.println("Kategori: " + olusturulanUrun.getKategori());
        System.out.println("Fiyat: " + olusturulanUrun.getFiyat());
    }
}
