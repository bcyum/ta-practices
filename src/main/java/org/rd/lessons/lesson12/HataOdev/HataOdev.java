package org.rd.lessons.lesson12.HataOdev;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HataOdev {

    public static void main(String[] args) {
        String dosyaYolu = "src/main/java/org/rd/lessons/lesson12/HataOdev/test.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = bufferedReader.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (FileNotFoundException ex) {
            int hataKodu = 1;
            System.out.println("Dosya bulunamadı: " + ex.getMessage() + " Hata kodu: " + hataKodu);
        } catch (IOException ex) {
            int hataKodu = 2;
            System.out.println("Dosya okuma hatası: " + ex.getMessage() + " Hata Kodu: " + hataKodu);
        } catch (Exception ex) {
            int hataKodu = 3;
            System.out.println("Bilinmeyen bir hata oluştu: " + ex.getMessage() + " Hata kodu: " + hataKodu);
        } finally {
            System.out.println("Dosya okuma işlemi tamamlandı.");
        }
    }
}
