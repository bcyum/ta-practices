package org.rd.lessons.lesson14.Odevler.Odev1generic;

public class GenelSinif {
    private String genelAlan;

    public GenelSinif(String genelAlan) {
        this.genelAlan = genelAlan;
    }

    public void genelAlanıYazdır() {
        System.out.println("Genel Alan: " + genelAlan);
    }

    public static void main(String[] args) {
        GenelSinif nesne = new GenelSinif("Merhaba, bu bir genel alan!");
        nesne.genelAlanıYazdır();
    }
}
