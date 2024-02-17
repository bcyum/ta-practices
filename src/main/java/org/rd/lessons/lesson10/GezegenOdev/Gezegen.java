package org.rd.lessons.lesson10.GezegenOdev;

public class Gezegen {
    private String ad;
    private int gezegenNo;
    private int uzaklik;
    private int yaricap;
    private int donmeSuresi;

    public Gezegen(String ad, int gezegenNo, int uzaklik, int yaricap, int donmeSuresi) {
        this.ad = ad;
        this.gezegenNo = gezegenNo;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }


    public int getGezegenNo() {
        return gezegenNo;
    }
    public void setGezegenNo(int gezegenNo) {
        this.gezegenNo = gezegenNo;
    }


    public int getUzaklik() {
        return uzaklik;
    }
    public void setUzaklik(int uzaklik) {
        this.uzaklik = uzaklik;
    }


    public int getYaricap() {
        return yaricap;
    }
    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }


    public int getDonmeSuresi() {
        return donmeSuresi;
    }
    public void setDonmeSuresi(int donmeSuresi) {
        this.donmeSuresi = donmeSuresi;
    }
}