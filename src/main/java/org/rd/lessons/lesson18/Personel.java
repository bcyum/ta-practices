package org.rd.lessons.lesson18;

public class Personel {
    String isim;
    String soyisim;
    String departman;
    int calisilanGun;
    double maas;
    int fazlaGunSayisi;

    public void kim (){
        double hesaplananMaas = hesaplaMaas(100);
        System.out.println(isim + " " + soyisim + departman + " departmaninda " + calisilanGun + " gun calisti, " + hesaplananMaas + " TL maas ve " + fazlaGunSayisi + " prim aldi.");
    }
    public double hesaplaMaas(int gunlukMaas) {
        double hesaplananMaas = calisilanGun * gunlukMaas;
        if (calisilanGun > 25) {
            fazlaGunSayisi = calisilanGun - 25;
            hesaplananMaas += fazlaGunSayisi * 1000;
        } else {
            fazlaGunSayisi = 0;
        }
        return hesaplananMaas;
    }
}
