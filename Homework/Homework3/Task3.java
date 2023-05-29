package Homework.Homework3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
    Вывести название каждой планеты и количество его повторений в списке. Collections.frequency()
     */
    

public class Task3 {
public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "Меркурий", "Венера", "Земля", "Марс", "Сатурн",
        " Уран", "Марс", "Меркурий", "Уран", "Земля",
        "Марс", "Сатурн", "Плутон", " Уран", "Нептун");

    Map<String, Integer> frequency = list.stream()
            // собираем элементы листа в карту
            .collect(Collectors.toMap(
                    // ключ - строка
                    e -> e,
                    // значение - число,
                    // количество вхождений
                    e -> 1,
                    // суммируем количество вхождений
                    Integer::sum));

    // Выводим значение по ключу
    System.out.println("Меркурий: " + frequency.get("Меркурий")); // Меркурий: 2

    // Обходим карту и выводим содержимое
    frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
