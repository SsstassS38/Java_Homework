package Seminars.Seminar1;

import java.util.Scanner;

// public class Task6 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();

//         int result = 1;
//         for(int i = 1; i <= b; i++){
//             result = result * a;
//         }
//         System.out.print(result);
//     }
// }


// Второе решение рекурсией

// public class Task6 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();

//         int c = pow(a, b);
//         System.out.print(c);
//     }


//     public static int pow(int a, int b){
//         if(b == 1){
//             return a;
//         } else{
//             return a * pow(a, b -1);
//         }
//     }
// }

// Третье решение встроенной утилитой

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double c = Math.pow(a, b);
        System.out.print(c);
    }
}