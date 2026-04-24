public class StackL<T> {
    JLinkedList<T> top;
    int t; // length

    StackL() {
        top = new JLinkedList<T>();
        t = 0; // length
    }

    void push(T element) {
        t += 1;
        top.insertFront(element);
    }

    T pop() {
        T data = null;
        if (!isEmpty()) {
            t--;
            data = top.deleteFront();
        } else { 
            System.out.println("Stack Underflow!");
        }
        return data;
    }

    public boolean isEmpty() {
        if (this.top.head.next == null) { //else we can also do t == 0;
            return true;
        } else {
            return false;
        }
    }

    void printStack() {
          if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            this.top.printList();
        }
    }

    T peek(){
        return top.getFront();
    }

    public static void main(String[] args) {
        StackL<Integer> a = new StackL<Integer>();
        System.out.println( a.isEmpty());
        a.push(28);
        a.push(29);
        a.push(30);
        a.push(24);
        System.out.println( a.isEmpty());
        a.printStack();
        a.pop();
        a.pop();
        a.push(30);
        a.printStack();
    }
}
