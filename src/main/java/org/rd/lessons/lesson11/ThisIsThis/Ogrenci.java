package org.rd.lessons.lesson11.ThisIsThis;

public class Ogrenci {
    private String isim;

    public void setIsim(String isim) {
        this.isim = isim;

    }

    public void yazdirOgrenci(){
        System.out.println("Öğrenci: "+  this.isim);
    }
}
