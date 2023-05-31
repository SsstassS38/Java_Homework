package Seminars.Seminar4;

 /*
    Реализовать консольное приложение, которое:
    ПРинимает от пользователя и "запоминает" строки.
    Ессли введно print, выводит строки так, чтобы последняя введенная была в списке, а первая последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
     */

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Example3 {
   
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        Scanner scanner = new Scanner(System.in);
        while (work){
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    print(list);
                    break;
                case "revert":
                    list.removeLast();
                    break;
                case "finish":
                    System.out.println("До новых встреч");
                    work = false;
                    break;
                default:
                    list.add(line);
            }
        }
    }

    static void print(LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }

    //Ошибочный вариант
    // static void print2(LinkedList<String> list){
    //     for (int i = list.size()-1; i >= 0; i--) {
    //         System.out.println(list.get(i));
    //     }
    // }
}