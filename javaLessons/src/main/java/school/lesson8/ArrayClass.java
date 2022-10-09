package school.lesson8;

import java.util.*;

public class ArrayClass {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Красный", "Оранжевый", "Жёлтый", "Зелёный", "Голубой",
                "Синий", "Фиолетовый", "Коричневый", "Чёрный", "Красный", "Оранжевый", "Жёлтый");

        Set<String> unique = new HashSet<>(words);

        System.out.println("Список уникальных слов:");
        System.out.println(unique);
        System.out.println("Сколько раз встречается каждое слово?");
        for (String key : unique)
            System.out.println(key + ": " + Collections.frequency(words, key));
    }
}
