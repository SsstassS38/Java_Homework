package Homework.Homework5;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

 public class Task1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Valeriy", "89677135441");
        phoneBook.add("Stas", "89091796444");
        phoneBook.add("Pavel", "89517691245");
        phoneBook.add("Victor", "89501254687");
        phoneBook.add("Helen", "89617135448");
        phoneBook.add("Stas", "89091796444");
        phoneBook.show();
        phoneBook.findNoteByNumber("89091796444");
        phoneBook.removeNumber("8951348577");
        phoneBook.showNote("Pavel");
        phoneBook.removeNote("Stas");
        phoneBook.show();

    }
}
