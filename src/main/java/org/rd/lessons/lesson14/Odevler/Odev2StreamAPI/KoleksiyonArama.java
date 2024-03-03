import java.util.List;
import java.util.Optional;
import org.rd.lessons.lesson14.Odevler.Odev2StreamAPI.Box2;

public class KoleksiyonArama {
    public static <T> Optional<T> koleksiyondaOgeBul(List<T> koleksiyon, T aranacakOge) {
        return koleksiyon.stream()
                .filter(oge -> oge.equals(aranacakOge))
                .findFirst();
    }

    public static void main(String[] args) {
        List<String> stringListesi = List.of("Java", "Python", "JavaScript");

        String aranacakOge = "C";
        sonucuGoster(stringListesi, aranacakOge);

        Box2<Integer> intBox = new Box2<>();
        intBox.setContent(-1);
        System.out.println(intBox.getContent());

        System.out.println();

        sonucuGoster(stringListesi, "Java");
        sonucuGoster(stringListesi, "C++");
    }

    public static <T> void sonucuGoster(List<T> koleksiyon, T aranacakOge) {
        Optional<T> sonuc = koleksiyondaOgeBul(koleksiyon, aranacakOge);

        if (sonuc.isPresent()) {
            System.out.println(aranacakOge + " öğesi bulundu.");
        } else {
            System.out.println(aranacakOge + " öğesi bulunamadı.");
        }
    }
}
