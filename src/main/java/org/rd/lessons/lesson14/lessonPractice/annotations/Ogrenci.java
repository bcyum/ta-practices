package org.rd.lessons.lesson14.lessonPractice.annotations;

public @interface Ogrenci {
    int id();
    String adi();
    String soyadi() default "Cura";
}