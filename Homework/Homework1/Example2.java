
// Задача 2: Вывести все простые числа от 1 до 1000

package Homework.Homework1;

public class Example2 {
    public static void main(String[] args) {
        simpleNumbers();
    }

    public static void simpleNumbers() {
        int k = 0;
                                                                         // Выводим простые числа
        System.out.println("Простые числа от 1 до 1000:");
        for (int i = 2; i <= 1000; i++) {
            boolean isSimpleNumbers = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimpleNumbers = false;
                    break;
                }
            }
            if (isSimpleNumbers) {
                System.out.print(i + " ");
                k++;
                if (k % 50 == 0) {
                    System.out.println();
                }

            }
        }
    }
}