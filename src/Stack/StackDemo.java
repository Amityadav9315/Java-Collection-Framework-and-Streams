package Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>(); //object
        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(stack );
        stack.push(6);
        stack.peek();
        System.out.println(stack);


    }
}
