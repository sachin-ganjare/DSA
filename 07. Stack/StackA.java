// LIFO

class StackA<T> {
    T[] arr;
    int top;
    int length;

    // Constructor
    StackA(T[] arr) {
        this.arr = arr;
        this.top = -1;
        this.length = arr.length;
    }

    // Methods - push pop printStack
    void push(T data) {
        if (top == this.length) {
            return;
        }
        top++;
        arr[top] = data;
    }

    T pop() {
        T a = null;
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            a = arr[top];
            top--;
        }
            return a;
    };

    void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    T peek(){
        return arr[top];
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[10];
        StackA<Integer> s1 = new StackA<Integer>(a);
        s1.push(5);
        s1.push(1);
        System.out.println(s1.peek());
        s1.push(7);
        s1.push(9);
        s1.printStack();
        s1.pop();
        s1.pop();
        s1.printStack();
        s1.pop();
        s1.printStack();
    }
}
