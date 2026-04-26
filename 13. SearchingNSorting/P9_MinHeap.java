public class P9_MinHeap<T extends Comparable<T>> {
    private T[] Heap;
    private int size;
    private int maxsize;
    private static final int FRONT = 0;

    public P9_MinHeap(T[] arr, T node) {
        this.maxsize = arr.length;
        this.size = 0;
        Heap = arr;
        Heap[0] = node;
    }   

    /* The following are some auxiliary methods. */
    // Function to return the position of the parent for the node currently at pos
    private int parent(int pos) {
        return pos / 2;
    }

    // Function to return the position of the left child for the node currently at
    // pos
    private int leftChild(int pos) {
        return (2 * pos);
    }

    // Function to return the position of the right child for the node currently at
    // pos
    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }
    // Continued to next..

    // Function that returns true if the passed node is a leaf node
    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    // Function to swap two nodes of the heap
    private void swap(int fpos, int spos) {
        T tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // Continued to next..
    /* The following is the method to print a heap tree. */
    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i]
                    + " LEFT CHILD : " + Heap[2 * i]
                    + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    // Function to build the min heap using the minHeapify
    public void minHeap() {
        for (int pos = (size / 2); pos >= 1; pos--) {
            minHeapify(pos);
        }
    }

    // Continued to next...
    private void minHeapify(int pos) {
        // If the node is a non-leaf node and greater than any of its child
        if (!isLeaf(pos)) {
            if (Heap[pos].compareTo(Heap[leftChild(pos)]) > 0
                    || Heap[pos].compareTo(Heap[rightChild(pos)]) > 0) {
                // Swap with the left child and heapify the left child
                if (Heap[leftChild(pos)].compareTo(Heap[rightChild(pos)]) < 0) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }
                // Swap with the right child and heapify the right child
                else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(T element) {
        if (size >= maxsize) {
            return;
        }
        Heap[++size] = element;
        int current = size;
        while (Heap[current].compareTo(Heap[parent(current)]) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Continued to next...
    /* Sorting with themean heap. */
    public T[] sort(T sorted[]) {
        // System.out.print(maxsize);
        int i = 0;
        while (size >= 0) {
            T a = remove();
            sorted[i] = a;
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.print(sorted[j] + " ");
        }
        return sorted;
    }

    //
    public T remove() {
        // System.out.print(size);
        T popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        return popped;
    }//

    /* The main method to test the program. */
public static void main(String[] arg)
{
System.out.println("The Min Heap is ");
Integer[] a = new Integer[15];
P9_MinHeap<Integer> minHeap = new P9_MinHeap<>(a , 5 );
//minHeap.insert(5);
minHeap.insert(3);
minHeap.insert(17);
minHeap.insert(10);
minHeap.insert(84);
minHeap.insert(19);
minHeap.insert(6);
minHeap.insert(22);
minHeap.insert(9);
minHeap.minHeap();
minHeap.print();
}

}
