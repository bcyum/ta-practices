package org.rd.lessons.lesson15.Odev.SingletonOdev;

public class SingletonOdev {
    private static SingletonOdev nesne;
    private SingletonOdev() {
    }

    public static SingletonOdev getNesne() {
        if (nesne == null) {
            nesne = new SingletonOdev();
        }
        return nesne;
    }
    public void mesajGoster() {
        System.out.println("SingletonOdev örneği kullanılıyor.");
    }
}
