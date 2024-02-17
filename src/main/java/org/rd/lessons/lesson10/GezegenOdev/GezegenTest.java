package org.rd.lessons.lesson10.GezegenOdev;

public class GezegenTest {
    public static void main(String[] args) {
        Gezegenler gezegen = Gezegenler.DUNYA;

        switch (gezegen) {
            case MARS:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.MARS.getGezegen().getAd());
                break;
            case JUPITER:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.JUPITER.getGezegen().getAd());
                break;
            case SATURN:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.SATURN.getGezegen().getAd());
                break;
            case URANUS:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.URANUS.getGezegen().getAd());
                break;
            case NEPTUN:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.NEPTUN.getGezegen().getAd());
                break;
            case PLUTON:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.PLUTON.getGezegen().getAd());
                break;
            case MERKUR:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.MERKUR.getGezegen().getAd());
                break;
            case VENUS:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.VENUS.getGezegen().getAd());
                break;
            case DUNYA:
                System.out.println("Yaşadığımız gezegen: " + Gezegenler.DUNYA.getGezegen().getAd() + " (Evimiz)");
                break;
        }
    }
}

