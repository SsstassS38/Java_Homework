package Seminars.Seminar1;

public class Task5 {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по JAVA";
        String[] array = s.split(" ");
        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
            
        }
    }
}
