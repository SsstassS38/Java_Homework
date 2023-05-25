package Seminars.Seminar1;

import java.util.Scanner;

// public class Task2 {
//     public static void main(String[] args) {
//         Scanner name = new Scanner(System.in);
//         System.out.print("Name is ");
//         String name1 = name.nextLine();
//         name.close();
//         System.out.println("Hello, " + name1);
//     }
// }


// ВТорое решение
public class Task2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String s = name.next();
        String out = new String("Привет, %s");
        System.out.printf(out,s);
        }
}
