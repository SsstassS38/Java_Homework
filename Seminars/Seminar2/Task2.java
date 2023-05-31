package Seminars.Seminar2;

import java.util.*;

// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.


public class Task2 {
    public static void main(String[] args) {
        String myString = "aaaabbbcaaadd";
        StringBuilder resString = new StringBuilder();
        int count = 1;
        for (int i = 0; i < myString.length()-1; i++) {
            if (myString.charAt(i + 1) == myString.charAt(i)) {
                count++;
            }
            else {
                resString.append(myString.charAt(i)).append(count);
                count = 1;
            }
        }
        resString.append(myString.charAt(myString.length()-1)).append(count);
        System.out.println(resString);
    }
}
