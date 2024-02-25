package org.rd.lessons.lesson11.DepartmanOdev;

public class Main {
    public static void main(String[] args) {
        Erkek erkekTakimLideri = new Erkek("Bilgin", "Özçalkan", "31/12/1976");
        Departman departman = new Departman(erkekTakimLideri);

        Erkek yeniTakimLideri = new Erkek("Yunus", "Özyavuz", "17/08/1978");
        departman.takimLideriniDegistir(yeniTakimLideri);

        Kadin kadinPersonel1 = new Kadin("Ayben", "Özçalkan", "22/09/1982");
        departman.personelEkle(kadinPersonel1);

        Kadin kadinPersonel2 = new Kadin("Güneş", "Taşkıran", "01/12/1999");
        departman.personelEkle(kadinPersonel2);

        Erkek erkekPersonel1 = new Erkek("Sercan", "İpekçioğlu", "01/07/1991");
        departman.personelEkle(erkekPersonel1);

        Erkek erkekPersonel2 = new Erkek("Önder", "Doğan", "30/01/1984");
        departman.personelEkle(erkekPersonel2);

        departman.personelCikar(erkekPersonel2);

        departman.gorevEkle("Görev 1");
        departman.gorevEkle("Görev 2");

        departman.gorevTamamlandiOlarakIsaretle("Görev 2");
        departman.departmanBilgileriniGoruntule();

        erkekTakimLideri.emeklilikYasiHesapla();
        kadinPersonel1.emeklilikYasiHesapla();
    }
}
