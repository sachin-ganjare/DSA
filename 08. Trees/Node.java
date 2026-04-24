// import java.lang.reflect.Method;
class Node<T extends Comparable<T>> {
    T element;
    Node<T> left; // ptrs
    Node<T> right;

    // Constructors
    Node(T element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    Node() {
        this.element = null;
        this.left = null;
        this.right = null;
    }

    // insertion
    void insert(T value) {
        if (element.compareTo(value) < 0) {
            // insert at right
            if (right == null) {
                right = new Node<T>(value);
            } else {
                right.insert(value);
            }
        } else if (element.compareTo(value) > 0) {
            if (left == null) {
                left = new Node<T>(value);
            } else {
                left.insert(value);
            }
        }
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            visit(root);
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            visit(root);
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            visit(root);
        }
    }

    void visit(Node n) {
        System.out.print(n.element + "  ");
    }

    Node<T> search(T e) {
   // Base Cases: root is null or key is present at root
        if (this == null) {
            return null;
        } else {
            if (this.element.compareTo(e) == 0)
                return this;
            // val is greater than root's key
            if (this.element.compareTo(e) > 0) {
                if (this.left == null)
                    return null;
                    
                return this.left.search(e);
            } else {
                if (this.right == null)
                    return null;
                // val is less than root's key
                return this.right.search(e);
            }
        }
    }

      public void search_Result(T e) {
        if (search(e) == null) {
            System.out.println("Not Found");
        } else {
            System.out.println(e + " : Found");
        }
    }


    public static void main(String[] args) {
        Node<Integer> root = new Node<Integer>(5);
        root.insert(3);
        root.insert(4);
        root.insert(12);
        root.insert(2);
        root.insert(13);
        root.insert(6);
        System.out.println("\nInorder :");
        root.inorder(root);
        System.out.println("\nPostorder :");
        root.postorder(root);
        System.out.println("\nPreorder :");
        root.preorder(root);
        System.out.println();
        System.out.println(root.search(3));
        System.out.println(root.search(13));
        System.out.println(root.search(12));
        System.out.println(root.search(6));
        System.out.println(root.search(1231231));

    }
}