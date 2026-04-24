public class _01_SimpleQueue<T>{
    int front, rear;
    int length;
    T[] arr;

    /*
    ----------
     <----  ______
    |||||||| rear(enque)
    ||||||||______
     <----    
    front(deque)    
    
    ---------
    */

    _01_SimpleQueue(T arr[]) {
        this.arr = arr ;
        length = arr.length;
        rear = -1; // insertion ptr
        front = 0; // removal ptr
    }

    // defining methods here
    // Enque
    void enque(T element) {
        // Check if queue is full
        if (rear >= length - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        rear++;
        arr[rear] = element;
    }

    boolean isEmpty() {
        if (front > rear) {
            return true;
        } else {
            return false;
        }
    }

    // dequeue
    T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue  Underflow");
            return null;
        } else {
            T deleted = arr[front];
            front++;
            return deleted;
        }
    }

    // traversal
    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue  Underflow");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[10];
        _01_SimpleQueue<Integer> q = new _01_SimpleQueue<Integer>(arr);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.printQueue();
        q.dequeue();
        q.printQueue();
        q.dequeue();
        q.printQueue();
    }

}