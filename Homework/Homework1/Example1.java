
//Задача 1: Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package Homework.Homework1;

import java.util.Scanner;

public class Example1 {
                                                                // вводим число
    public static void main(String[] args) {
        firstTask();
    }

    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = -1;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        if (n >= 0) {
                                                            // Вычисляем n-ое треугольное число
            int triangleNumber = 0;
            for (int i = 1; i <= n; i++) {
                triangleNumber += i;
            }
            System.out.println("n-ое треугольное число: " + triangleNumber);
                                                         // Вычисляем n!
            int factorialN = 1;
            for (int i = 1; i <= n; i++) {
                factorialN *= i;
            }
            System.out.println("Факториал n: " + factorialN);
        } else {
            System.out.println("Вводить надо число n >= 0");
        }
        scanner.close();
    }
}