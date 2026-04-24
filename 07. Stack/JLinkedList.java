// logic - using nested class - LL > node, head node must be inside LL, so that whenever we create 
// new linkedlist, new head node with will be created.
// then we can define all the methods in Linkedlist clss.

import java.util.*;
import java.io.*;
class JLinkedList<T> {
    //Fields
    class Node {
        T data;
        Node next;

        // Constructor
        Node() {
            data = null;
            next = null;
        }

        Node(T d) {
            data = d;
            next = null;
        }
    }

    Node head;
    JLinkedList() { // LinkedList Header Node
        head = new Node();
    }

    //Methods
    public void insertFront(T data) {
        Node newNode = new Node(data);
        newNode.next = this.head.next;
        this.head.next = newNode;
    }

    // Defining the method to Insert at the end
    public void insertEnd(T data) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node currNode = this.head.next;
        System.out.print("LinkedList: ");
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void merge(JLinkedList<T> l2) {
        Node l1Node = this.head;
        Node l2Node = l2.head;
        while (l1Node.next != null) {
            l1Node = l1Node.next;
        }
        l1Node.next = l2Node.next;
        // free(l2.head); // Return the node to free memory
    }

    public void insertKey(T data, T key) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;
        boolean status = false;
        while (temp != null) {
            if (temp.data == key) {
                status = true;
                break;
            }
            temp = temp.next;
        }
        if (status) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public T deleteFront() {
        T x = null;
        Node temp = this.head.next, prev = null;
        if (temp != null) {
            x = temp.data;
            this.head.next = temp.next; // Changed head
            // Display the message
            // System.out.println("Element deleted");
        }
        return x; // Return the deleted data
    }

    public T deleteEnd() {
        T x = null;
        Node temp = this.head.next, prev = null;
        if (temp != null) { // If the list is not empty
            while (temp != null) { // Move to the end node
                prev = temp;
                temp = temp.next;
            }
            x = temp.data;
            prev.next = null;
        }
        return x;
    }

    public void deleteKey(T key) {
        Node temp = this.head.next, prev = null;
        while (temp != null) {
            if (temp.data == key) {
                prev.next = temp.next;
                // Display the message
                System.out.println(key + " position element deleted");
                break;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
    }

    public Node remove(Node n) {
        Node current = n;
        Node next = n.next;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head.next = prev;
        return next;
    }

    public void reverse() {
        Node currNode = this.head.next;
        System.out.print("Reversed List : ");
        remove(currNode);
    }

    
     T getFront() {
        return head.next.data;
    }

    public static void main(String args[]) {
        JLinkedList<Integer> list = new JLinkedList<Integer>();
        list.insertEnd(9);
        list.printList();
        list.insertFront(5);
        list.printList();
        list.insertEnd(10);
        list.printList();
        list.insertKey(7, 5);
        list.printList();
        list.insertKey(12, 0);
        list.printList();
        list.insertKey(13, 10);
        list.printList();
        list.insertFront(2);
        list.printList();
        list.reverse();
        list.printList();
    }
}