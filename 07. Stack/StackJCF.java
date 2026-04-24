import java.util.*;

public class StackJCF {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(7);
        stack.forEach(i -> System.out.print(i + " "));
        System.out.println();
        stack.push(8);
        stack.push(5);
        stack.push(13);
        stack.push(5);
        stack.push(5);
        stack.forEach(i -> System.out.print(i + " "));
        System.out.println();
        stack.pop();
        stack.forEach(i -> System.out.print(i + " "));
        System.out.println();
        int a = stack.search(13);
        System.out.println(a);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        
    }
}
