package org.rd.lessons.lesson11;

public class VeriSaklayici {
    private int gizliSayi;

    public int getGizliSayi() {

//        if (gizliSayi > 10)
            return gizliSayi;
//        else {
//            return gizliSayi - 1;
//        }
    }
    public void setGizliSayi(int gizliSayi) {
        this.gizliSayi = gizliSayi;
    }
    private int topla(int sayi){
        return sayi + gizliSayi;
    }
    public void Hesaplama(int x, int y){
        setGizliSayi(y);
        System.out.println("Toplam: " + topla(x));
    }
}
