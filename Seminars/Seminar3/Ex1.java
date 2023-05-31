package Seminars.Seminar3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        /*
        Заполнить список десятью случайными числами,
        Отсортировать список методом sort() И вывести его на экран.
         */
        List<Integer> list = createList(2, 8, 10);
        System.out.println(list);
        Collections.sort(list);
        //list.sort(null);             одинаковое действие
        System.out.println(list);
    }

    static List<Integer> createList(int min, int max, int count){
        List<Integer> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            int rnd = (int)(Math.random() * (max - min + 1) + min);
            list.add(rnd);
        }
        return list;
    }
}
