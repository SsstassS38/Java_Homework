/* Задание №1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
*/


public class Task1 {
    public static void main(String[] args) {
        char a = 'a';
            char b = 'b';
            int n = 10;
            System.out.println(res(a, b, n));
        }
        static String res(char c1, char c2, int n){
            if(n%2 != 0){
                return "Введено не верное число";
    
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n / 2; i++) {
                stringBuilder.append(c1);
                stringBuilder.append(c2);            
            }
            return stringBuilder.toString();
}
}


/*import java.util.*;
/*


     public class Task1 {
        public static void main(String[] args) {
            
    }
     */