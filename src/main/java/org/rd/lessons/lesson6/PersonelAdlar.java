package org.rd.lessons.lesson6;

public class PersonelAdlar {
    public static void main(String[] args){
        Personel personel1 = new Personel();
        Personel personel2 = new Personel();

        personel1.isim = "Ahmet";
        personel1.soyisim = "Yılmaz";
        personel1.departman = " muhasebe";
        personel1.calisilanGun = 15;
        personel1.hesaplaMaas(100);

        personel2.isim = "Bekir Can";
        personel2.soyisim = "Yumrutepe";
        personel2.departman = " satis";
        personel2.calisilanGun = 30;
        personel2.hesaplaMaas(100);

        personel1.kim();
        personel2.kim();
    }
}