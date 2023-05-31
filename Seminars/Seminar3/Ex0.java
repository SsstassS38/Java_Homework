package Seminars.Seminar3;

import java.util.ArrayList;
import java.util.List;

public class Ex0 {
    public static void main(String[] args) {
        /*
        Даны следующие строки, сравнить их с помощью метода == и метода equals() класса  Object
         */
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s5));

        List<Integer> list = new ArrayList<>();
        int a = 5;
        test(list, a);

        System.out.println(list);
        System.out.println(a);
    }

    static void test(List<Integer> list, int a){
        list.add(7);
        a++;
    }
}