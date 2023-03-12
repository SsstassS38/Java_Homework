//Задача 3: Реализовать простой калькулятор

package Homework.Homework1;

import java.util.Scanner;
public class Example3 {

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение с пробелами, пример (2 + 2):");
        String expression = scanner.nextLine();
        String[] numbers = expression.split(" ");
        if (numbers.length == 3) {
            int number1 = 0;
            int number2 = 0;
            try {
                number1 = Integer.parseInt(numbers[0]);
                number2 = Integer.parseInt(numbers[2]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат чисел!");
            }
            char operator = numbers[1].charAt(0);
            if (operator == '/' && number2 == 0){
                System.out.println("Деление на ноль не возможно!");
            } else switch (operator) {
                case '+' -> System.out.println(number1 + number2);
                case '-' -> System.out.println(number1 - number2);
                case '*' -> System.out.println(number1 * number2);
                case '/' -> System.out.println(number1 / number2);
                default -> System.out.println("Неверный оператор!");

            }
        }
        else{
            System.out.println("Неверное количество слагаемых!");
        }
        scanner.close();
    }
}
