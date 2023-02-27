/*
 2.Пусть дан список сотрудников:

Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

 Написать программу, которая найдет и выведет повторяющиеся
 имена с количеством повторений.
 Отсортировать по убыванию популярности.
 Для сортировки использовать TreeMap.
*/
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex_02SortNames {
    public static void main(String[] args) {
        String str = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, \n" +
                "Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, \n" +
                "Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, \n" +
                "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        String[] list = str.replace("\n", "").split(", ");
        System.out.println(Arrays.toString(list));

        Map<Integer, List<String>> namesMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i].split(" ")[0].equals(list[j].split(" ")[0])) {
                    count++;
                }
            }
            // Проверяем: есть ли в коллекции такой ключ = количеству повторов
            if (namesMap.containsKey(count)) {  // Если есть, получаем его
                List<String> namesList = namesMap.get(count);   // Добавляем по нему значение
                if (!namesList.contains(list[i].split(" ")[0])) {   // если его там не было
                    namesList.add(list[i].split(" ")[0]);
                }
            } else {
                List<String> namesList = new ArrayList<>();
                namesList.add(list[i].split(" ")[0]);
                namesMap.put(count, namesList);
            }
        }
//        System.out.println(namesMap);
        for (Map.Entry entry: namesMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
