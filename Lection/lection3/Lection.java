// package lection3;


//                                                                                                         Object

// public class Lection {
//      public static void main(String[] args) {
//          Object o = 1; GetType(o); // java.lang.Integer
//          o = 1.2; GetType(o); // java.lang.Double
//      }
//      static void GetType(Object obj) {
//          System.out.println(obj.getClass().getName());
//      }
// }


//                                                                           Object использовать в крайнем случае, но пользоваться аккуратно, т.к. замедляет процесс, много ветвей ифоф для проверки
// public class Lection {
//     public static void main(String[] args) {
//     System.out.println(Sum(1, 2));
//     System.out.println(Sum(1.0, 2));
//     System.out.println(Sum(1, 2.0));
//     System.out.println(Sum(1.2, 2.1));
//     }
//     static Object Sum(Object a, Object b) {
//     if (a instanceof Double && b instanceof Double) {
//     return (Object)((Double) a + (Double) b);
//     } else if(a instanceof Integer && b instanceof Integer) {
//     return (Object)((Integer) a + (Integer) b);
//     } else return 0;
//     }
//    }




//                                                                                                         Массивы
   

// Проблема. Как увеличить размер массива?
// Есть массив из 2 элементов

// Например


// public class Lection {
//     public static void main(String[] args) {
//     int[] a = new int[] { 1, 9 };
//     int[] b = new int[3];
//     System.arraycopy(a, 0, b, 0, a.length);
//     for (int i : a) { System.out.printf("%d ", i);} // 1 9
//     for (int j : b) { System.out.printf("%d ", j);}
//     // 0 9 0 0 0 0 0 0 0 0
//     } }


    // public class Lection {
    //     static int[] AddItem(int[] array, int item) {
    //     int length = array.length;
    //     int[] temp = new int[length + 1];
    //     System.arraycopy(array, 0, temp, 0, length);
    //     temp[length] = item;
    //     return temp;
    //     }
    //     public static void main(String[] args) {
    //     int[] a = new int[] { 0, 9 };
    //     for (int i : a) { System.out.printf("%d ", i); }
    //     a = AddItem(a, 2);
    //     a = AddItem(a, 3);
    //     for (int j : a) { System.out.printf("%d ", j); }
    //     }
    //    }
       

    //                                                                                       Иерархия коллекций. ArrayList

//     «Удобный массив»
// Разные способы создания

// ArrayList list = new ArrayList();

//                                                                                          Иерархия коллекций. List

// List – пронумерованный набор элементов.
// Пользователь этого интерфейса имеет точный контроль над тем,
// где в списке вставляется каждый элемент.
// Пользователь может обращаться к элементам по их целочисленному
// индексу (позиции в списке) и искать элементы в списке.

//                                                                                        Иерархия коллекций. ArrayList

// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3);

//                                                                                            Коллекции

// import java.util.ArrayList;
// import java.util.List;
// public class Ex002_ArrayList {
//     public static void main(String[] args) {
//     List list = new ArrayList();
//     list.add(2809);
//     list.add("string line");
//         for (Object o : list) {
//     System.out.println(o);
                                // Проблема извлечения данных
//         }
//     }
// }

//                                                                                           Коллекции. Функционал

// Ex004
// Ex005



//                                                                                                  Итератор
// Ex007