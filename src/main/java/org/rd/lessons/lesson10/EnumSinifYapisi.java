package org.rd.lessons.lesson10;

public class EnumSinifYapisi {
    public static void main(String[] args) {
        HaftaGunleri bugun = HaftaGunleri.PERSEMBE;

        System.out.println("Gün Numarası: " + bugun.getGunNo());
        System.out.println("Günün Durumu: " + bugun.isHaftaIci());

        System.out.println();

        HaftaGunleri secilenGun = HaftaGunleri.CUMARTESI;

        System.out.println("Seçilen Gün Numarası: " + secilenGun.getGunNo());
        System.out.println("Seçilen Günün Durumu: " + secilenGun.isHaftaIci());
    }
}
