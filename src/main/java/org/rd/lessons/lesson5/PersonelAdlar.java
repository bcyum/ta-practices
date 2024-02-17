package org.rd.lessons.lesson5;


public class PersonelAdlar {
    public static void main(String[] args){
        Personel personel1 = new Personel();
        Personel personel2 = new Personel();

        personel1.isim = "Ahmet";
        personel1.soyisim = "Yılmaz";
        personel1.departman = " muhasebe";
        personel1.yas = 24;

        personel2.isim = "Bekir Can";
        personel2.soyisim = "Yumrutepe";
        personel2.departman = " satis";
        personel2.yas = 30;

        personel1.kim();
        System.out.println(personel1.isim + " " + personel1.soyisim + " " + personel1.getYas() + " yaşında");
        personel2.kim();
        System.out.println(personel2.isim + " " + personel2.soyisim + " " + personel2.getYas() + " yaşında");

    }
}
