package org.rd.lessons.lesson9;

public class StaticMetotOrnek1 {
    public static void statikMetot(){
        System.out.println("Bu bir static metottur.");
    }

    public void nonStaticMetot(){
        System.out.println("Static olmayan metottur.");
    }

    public static void main(String[] args){
        StaticMetotOrnek1.statikMetot();

        StaticMetotOrnek1 ornekNesne = new StaticMetotOrnek1();
        ornekNesne.nonStaticMetot();
    }
}