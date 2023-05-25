// Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1,1,1,1,1], 
// вывести максимальное количество подряд идущих 1.



// package Seminars;

// import java.util.Arrays;

// public class Example2 {
//     public static void main(String[] args) {
//         int[] arg = {0, 0, 0, 1, 1, 1, 1 ,1, 0 ,0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//         int count = 0;
//         int max = 0;
//         for (int i = 0; i < arg.length; i++) {
//             if (arg[i] == 1){
//                 count++;
//                 if (count > max) max = count;
//             }
//             else count = 0;
//         }
//         System.out.println(Arrays.toString(arg));
//         System.out.println(max);
//     }
    
    //                                                              Решение от 2 зала (более быстро будет работать)


    package Seminars;

import java.util.Arrays;

public class Example2 {
       public static void main(String[] args) {
        int[] array = new int[]{0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                count++;
            }
            else {
                max_count = Math.max(count, max_count);
                count = 0;
            }
        }
        max_count = Math.max(count, max_count);
        System.out.printf("Максимальное кол-во раз единица встретилась %d\n", max_count);
    }
}
    