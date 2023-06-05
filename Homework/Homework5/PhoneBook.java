package Homework.Homework5;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> book = new HashMap<>();
    
    void show(){
        System.out.println(book);
    }

    void add(String name, String namber){
        if (!doesNumberExist(namber)) {
            if (!book.containsKey(name)) {
                book.put(name, new ArrayList<>());
            }
                book.get(name).add(namber);    
        }else{
            System.out.println("Такой номер есть в справочнике!");
        }
    }

    boolean doesNumberExist(String namber){
        for (String key : book.keySet()) {
            if (book.get(key).contains(namber)) {
                return true;
            }
        }
        return false;
    }

    void showNote(String name){
        if (book.containsKey(name)) {
            System.out.println(name + ": " + book.get(name));
        }else{
            System.out.println("Такое имя не найдено!");
        }
    }

    void findNoteByNumber(String namber){
        for (String key : book.keySet()) {
            if (book.get(key).contains(namber)) {
                showNote(key);
                return;
            }
        }
        System.out.println("Такое имя не найдено!");
    }

    void removeNote(String name){
        if (book.containsKey(name)) {
            book.remove(name);
        }else{
            System.out.println("Такое имя не найдено!");
        }
        
    }

    void removeNumber(String namber){
        for (String key : book.keySet()) {
            if (book.get(key).contains(namber)) {
                book.get(key).remove(namber);
                return;
            }
        }
        System.out.println("Такое имя не найдено!");
    }
}
