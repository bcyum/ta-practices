package org.rd.lessons.lesson11.DepartmanOdev;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private Personel takimLideri;
    private Personel ikinciTakimLideri;
    private List<Personel> personelListesi;
    private List<String> gorevListesi;

    public Departman(Personel takimLideri) {
        if (takimLideri != null) {
            this.takimLideri = takimLideri;
            this.personelListesi = new ArrayList<>();
            this.gorevListesi = new ArrayList<>();
        }
    }
///
    public void takimLideriniDegistir(Personel yeniTakimLideri) {
        if (yeniTakimLideri != null) {
            if (takimLideri != null) {
                ikinciTakimLideri = takimLideri;
            }

            takimLideri = yeniTakimLideri;
        }
    }
///
    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }
///
    public void personelCikar(Personel personel) {
        personelListesi.remove(personel);
    }
///
    public void gorevEkle(String gorev) {
        gorevListesi.add(gorev);
    }
///
    public void gorevTamamlandiOlarakIsaretle(String gorev) {
        if (gorevListesi.contains(gorev)) {
            int index = gorevListesi.indexOf(gorev);
            gorevListesi.set(index, gorev + " (Tamamlandı)");
        }
    }
///
    public void departmanBilgileriniGoruntule() {
        System.out.println("Takım Lideri (İlk): " + takimLideri.getTamAd());
        for (Personel personel : personelListesi) {
            System.out.println(" - " + personel.getTamAd());
        }
        System.out.println("Görev Listesi: " + gorevListesi);
        if (ikinciTakimLideri != null) {
            System.out.println("Takım Lideri (İkinci): " + ikinciTakimLideri.getTamAd());
        }
    }
}