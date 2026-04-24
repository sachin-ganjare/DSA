// Java program to add two polynomials

class Node {
    int coeff;
    int pow;
    Node next;
    Node(int c, int p) {
        coeff = c;
        pow = p;
        next = null;
    }
}

class JPolynomialAddition {

    static Node addPolynomial(Node head1, Node head2) {
        
        // if any list is empty, then return
        // the other list.
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        
        // If head1.pow is greater, then recursively find
        // its next node, and return head1.
        if (head1.pow > head2.pow) {
            Node nextPtr = addPolynomial(head1.next, head2);
            head1.next = nextPtr;
            return head1;
        }
    
        // If head2.pow is greater, then recursively find its 
        // next node, and return head2.
        else if (head1.pow < head2.pow) {
            Node nextPtr = addPolynomial(head1, head2.next);
            head2.next = nextPtr;
            return head2;
        }
    
        // else store the sum of head1.coeff and head2.coeff in
        // head1.coeff, then find its next node and return head1.
        Node nextPtr = addPolynomial(head1.next, head2.next);
        head1.coeff += head2.coeff;
        head1.next = nextPtr;
        return head1;
    }

    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.coeff + "," + curr.pow + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        // 1st polynomial: 5x^2+4x^1+2x^0
        Node head1 = new Node(5, 2);
        head1.next = new Node(4, 1);
        head1.next.next = new Node(2, 0);

        // 2nd polynomial: -5x^1-5x^0
        Node head2 = new Node(-5, 1);
        head2.next = new Node(-5, 0);

        Node head = addPolynomial(head1, head2);

        printList(head);
    }
}