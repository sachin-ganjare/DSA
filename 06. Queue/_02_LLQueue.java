class _02_LLQueue<T> {
    JLinkedList<T> rear, front;

    // Constructor
    _02_LLQueue() {
        front = new JLinkedList<T>();
        rear = front;
    }

    // Methods
    void enqueue(T data) {
        // No need to check if full
        // insert at rear
        rear.insertEnd(data);
    }

    void dequeue() {
        front.deleteFront();
    }

    void printQueue() {
        front.printList();
    }

    public static void main(String[] args) {
        // Driver code: insert at rear, delete at front
        _02_LLQueue<Integer> q = new _02_LLQueue<Integer>();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.printQueue();
        q.dequeue();
        q.printQueue();
        q.dequeue();
        q.printQueue();
    }
}