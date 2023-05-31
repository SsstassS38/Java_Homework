package Seminars.Seminar4;
  /*
    1) Замерьте время, за которое в ArrayList добавляется 10000 элементов
    2) Замерьте время, за которое в LinkedList добавляется 10000 элементов.Сравните с предыдущим
     */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
  
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, i);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - timeStart);
    }
}

// ArrayList  более удобная коллекция, которая используется в 80% случаев. Придобавлении элементов увеличивает размер листа в два раза.

// LinkedList ссылочный
