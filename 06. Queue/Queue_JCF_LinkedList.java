import java.util.*;
public class Queue_JCF_LinkedList {
        public static void main(String[] args) {
            // Using LinkedList
            Queue <Integer> q = new LinkedList<Integer>();
            q.offer(2);  q.offer(3);  q.offer(4); q.offer(8); q.offer(0);
            q.forEach(i->System.out.print(i +" ")); System.out.println();

            q.poll();
            q.forEach(i->System.out.print(i +" ")); System.out.println();

            q.poll();
            q.offer(12); 
            q.forEach(i->System.out.print(i +" ")); System.out.println();

            q.poll(); q.poll();
            q.forEach(i->System.out.print(i +" ")); System.out.println();

            System.out.println(q.contains(2));
            // q.clear();
            System.out.println(q.size());
            //q.remove(2)
            

        }
}
