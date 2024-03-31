package org.rd.lessons.lesson14.Odevler.Odev1generic;

public class GenelSinif<T> {
    private T genelAlan;

    public GenelSinif(T genelAlan) {
        this.genelAlan = genelAlan;
    }

    public void genelAlanıYazdır() {
        System.out.println("Genel Alan: " + genelAlan);
    }

    public static void main(String[] args) {
        GenelSinif<Integer> integerNesne = new GenelSinif<>(42);
        integerNesne.genelAlanıYazdır();

        GenelSinif<String> stringNesne = new GenelSinif<>("Merhaba, bu bir genel alan!");
        stringNesne.genelAlanıYazdır();

        GenelSinif<Boolean> boolNesne = new GenelSinif<>(true);
        boolNesne.genelAlanıYazdır();
    }
}