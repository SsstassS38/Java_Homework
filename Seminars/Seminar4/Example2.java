package Seminars.Seminar4;

/*
    реализовать консольное приложение, которое:
    принимает   пользователя строку вида text~num 
    Нужно расплитить строку по ~, сохранить text из позиции в связный список на позицию num,
    Если  введено print~sum, выводит строку из позции num в связном списке и удаляет её из списка
*/

import java.util.LinkedList;
import java.util.Scanner;

public class Example2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work){
            String line = scanner.nextLine();
            if (!line.contains("~")){
                System.out.println("Не верный формат строки");
                continue;
            }
            String text = line.split("~")[0];
            String num = line.split("~")[1];
            int position = Integer.parseInt(num);
            switch (text){
                case "print":
                    System.out.println(list.remove(position));
                    break;
                case "end":
                    System.out.println("До новых встреч");
                    work = false;
                    break;
                default:
                    list.add(position, text);
            }
        }
    }
}
