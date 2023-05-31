// // Дано четное число N (>0) и символы c1 и c2.
// // Написать метод, который вернет строку длины N, которая состоит
// // из чередующихся символов c1 и c2, начиная с c1.

// package lection3;

// public class Ex008 {
//     public static void main(String[] args) {
//         char c1 = 'a';
//         char c2 = 'b';
//         int N = 6;
//         StringBuilder newString = new StringBuilder();      //решение через StringBuilder
//         for (int i = 0; i < N/2; i++) {
//             newString.append(c1).append(c2);
//         }
//         System.out.println(newString);

// // решение через строку
//             String strString = new String();
//             String chars = Character.toString(c1) + Character.toString(c2);
//             for (int i = 0; i < N / 2; i++) {
//                 strString += chars;
//             }
//             System.out.println(newString);
//     }
// }
