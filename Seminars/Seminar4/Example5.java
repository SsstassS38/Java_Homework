package Seminars.Seminar4;

/*
 * Реализовать Стэк с помощью массива
 * Нужно реализовать методы:
 * size(); empty(); push(); peek(); pop(); 
 */
public class Example5 {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(stack.empty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.size());
    }
}
