package Seminars.Seminar3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
    /*
       СОздать список типа ArrayList
       Поместить в него как строки, так и целые числа.
       Пройтись по списку, найти и удалить целые числа.
    */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add("1");
        list.add(15);
        list.add(17);
        list.add("пока");
        list.add(-8);
        list.add("привет");
        list.add(3.14);

        //Вариант 1
//        for (int i = 0; i < list.size(); i++) {
//            Object object = list.get(i);
//            if (object instanceof Integer){
//                list.remove(i);
//                i--;
//            }
//        }

        //Вариант 2
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (object instanceof Integer){
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}