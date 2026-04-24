import java.lang.reflect.Method;

public class TreeNode<T extends Comparable<T>> {
  T element;
  TreeNode<T> left;
  TreeNode<T> right;

  public TreeNode(T o) {
    this.element = o;
    this.left = null;
    this.right = null;
  }

  public TreeNode() {
    this.element = null;
    this.left = null;
    this.right = null;
  }
  // Methods of this class are defined next ...to be added here.

  public void insert(T o) {
    if (element.compareTo(o) < 0) {
      if (right == null) {
        right = new TreeNode<T>(o);
      } else {
        right.insert(o);
      }
    } else if (element.compareTo(o) > 0) {
      if (left == null) {
        left = new TreeNode<T>(o);
      } else {
        left.insert(o);
      }
    }
  }

  TreeNode delete(TreeNode root, T key) {
    /* Base Case: If the tree is empty */
    if (root == null)
      return root;
    /* Otherwise, recur down the tree */
    if (root.element.compareTo(key) > 0)
      root.left = delete(root.left, key);
    else if (root.element.compareTo(key) < 0)
      root.right = delete(root.right, key);
    // if key is same as root's key, then This is the node
    // to be deleted
    else {
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;
      // node with two children: Get the inorder successor
      root.element = inSucc(root.right);
      // Delete the inorder successor
      root.right = delete(root.right, this.element);
    }
    return root;
  }

  // Method to find the inorder successor of the TreeNode
  public T inSucc(TreeNode root) {
    T minv = this.element;
    while (root.left != null) {
      minv = this.left.element;
      root = root.left;
    }
    return minv;
  }

  // Method to find the inorder successor of a node
  public TreeNode search(T key) {
    // Base Cases: root is null or key is present at root
    if (this == null) {
      return null;
    } else {
      if (this.element.compareTo(key) == 0)
        return this;
      // val is greater than root's key
      if (this.element.compareTo(key) > 0) {
        if (this.left == null)
          return null;
        return this.left.search(key);
      } else {
        if (this.right == null)
          return null;
        // val is less than root's key
        return this.right.search(key);
      }
    }
  }

  public void search_Result(T key) {
    if (search(key) == null) {
      System.out.println("Not Found");
    } else {
      System.out.println(key + " : Found");
    }
  }

  // 30.6 Tree Traversals
  static void inorder(TreeNode<T> R) {
    if (R != null) {
      inorder(R.left);
      R.visit();
      inorder(R.right);
    }
  }

 

  static void preorder(TreeNode<T> R) {
    if (R != null) {
      R.visit();
      preorder(R.left);
      preorder(R.right);
    }
  }

  static void postorder(TreeNode<T> R) {
    if (R != null) {
      postorder(R.left);
      postorder(R.right);
      R.visit();
    }
  }

  public void visit() {
    System.out.print(this.element + " ");
  }

  // 30.7 Main Method
  public static void main(String args[]) {
    TreeNode<Integer> root = new TreeNode<Integer>(6);
    root.insert(5);
    root.insert(7);
    root.insert(4);
    inorder(root);
    System.out.println();
    preorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    root.delete(root, 5);
    inorder(root);
    System.out.println();
    root.search(7);
    root.search(12);
    root.search(-112);
  }
  // End of all methods of this program
} // End of the program
