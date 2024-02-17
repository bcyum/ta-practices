package org.rd.lessons.lesson10.GezegenOdev;

public class GezegenTest2 {
    public static void main(String[] args) {
        Gezegenler gezegenimiz = Gezegenler.DUNYA;

        System.out.println("Gezegenimiz " + gezegenimiz.getGezegen().getAd() +
                ", Güneşe göre " + gezegenimiz.getGezegen().getGezegenNo() + ". sırada yer alır" +
                ", Güneşe uzaklığı " + gezegenimiz.getGezegen().getUzaklik() + " km'dir" +
                ", Yarıçapı: " + gezegenimiz.getGezegen().getYaricap() + " km'dir" +
                ", kendi ekseni etrafında " + gezegenimiz.getGezegen().getDonmeSuresi() + " günde döner.");
    }
}
