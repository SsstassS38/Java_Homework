package Seminars.Seminar3;


import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    /*
    Каталог товаров книжного магазина сохранен в двумерном списке List<ArrayList<String>>
    так, что на нулевой позиции каждого внутреннего списка содержится название жанра,
    а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
    [
        [Детектив‚ Агата Кристи, Шерлок Холмс],
        [Сказки, Золотая рыбка, Колобок, Курочка Ряба],
        [Фэнтези, Гари Поттер, Ночной дозор]
    ]
     */
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Детектив", "Агата Кристи");
        addBook(shopBook, "Сказки", "Золотая рыбка");
        addBook(shopBook, "Детектив", "Шерлок Холм");
        addBook(shopBook, "Сказки", "Колобок");
        addBook(shopBook, "Фэнтези", "Гари Поттер");
        addBook(shopBook, "Фэнтези", "Ночной дозор");
        addBook(shopBook, "Сказки", "Курочка Ряба");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        //Проверяем есть ли записи с нужным жанром
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> genreItem = shopBook.get(i);
            if (genreItem.get(0).equalsIgnoreCase(genre)){
                genreItem.add(nameBook);
                return;
            }
        }
        //Добавляем новый жанр или книгу в жтот данр
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}