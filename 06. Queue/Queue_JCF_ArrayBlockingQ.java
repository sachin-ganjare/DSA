import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

//Some Blocking Operations are: put(e) take() offer(e,timeunit) poll(e,timeunit)
public class Queue_JCF_ArrayBlockingQ {
    public static void main(String[] args) {
        // Using LinkedList
        Queue<Integer> q = new ArrayBlockingQueue<Integer>(2);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(8);
        q.offer(0);
        q.forEach(i -> System.out.print(i + " "));
        System.out.println();

        q.poll();
        q.forEach(i -> System.out.print(i + " "));
        System.out.println();

        q.poll();
        q.offer(12);
        q.forEach(i -> System.out.print(i + " "));
        System.out.println();

        q.poll();
        q.poll();
        q.forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println(q.contains(2));
        // q.clear();
        System.out.println(q.size());
        // q.remove(2)

    }
}
