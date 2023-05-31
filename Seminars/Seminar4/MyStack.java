package Seminars.Seminar4;

/*
 * Реализовать Стэк с помощью массива
 * Нужно реализовать методы:
 * size(); empty(); push(); peek(); pop(); 
 */

public class MyStack {
    //buffer
    private Integer[] array = new Integer[10];
    //Размер Стэка
    private int size = 0;

    //размер стэка
    int size(){
        return size;
    }

    //ПРоверяет пустой ли стэк
    boolean empty(){
        return size == 0;
    }

    //Добавляет элемент в стэк
    void push(int item){
        if (size >= array.length){
            Integer[] newArray = new Integer[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = item;
        size++;
    }

    //Показывает жлемент на вершине стэека
    int peek(){
        return array[size-1];
    }

    //Показывает жлемент на вершине стэека и удаляет его
    int pop(){
        size--;
        return array[size];
    }
}
