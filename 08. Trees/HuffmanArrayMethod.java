import java.util.Arrays;
import java.util.Comparator;

class Node {
    int weight;
    Node left, right;

    Node(int weight) {
        this.weight = weight;
        this.left = null;
        this.right = null;
    }
}

public class HuffmanArrayMethod {

    // Sort PARRAY from index i to N-1 based on weight
    static void sortPArray(Node[] pArray, int start, int n) {
        Arrays.sort(pArray, start, n, Comparator.comparingInt(a -> a.weight));
    }

    public static Node buildHuffmanTree(int[] W) {
        int N = W.length;

        // Step 1–7: Initialize PARRAY
        Node[] pArray = new Node[N];
        for (int i = 0; i < N; i++) {
            Node ptr = new Node(W[i]);
            pArray[i] = ptr;
        }

        // Step 8–18: Build tree
        int i = 0;
        while (i < N - 1) {
            // Step 10: sort from i to N-1
            sortPArray(pArray, i, N);

            // Step 11–15: create new internal node
            Node ptr = new Node(0);
            ptr.left = pArray[i];
            ptr.right = pArray[i + 1];
            ptr.weight = ptr.left.weight + ptr.right.weight;

            // Step 16: store back
            pArray[i + 1] = ptr;

            i++;
        }

        // Step 19: root
        return pArray[N - 1];
    }

    // Utility: print tree (preorder)
    public static void printTree(Node root) {
        if (root == null) return;
        System.out.print(root.weight + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        int[] weights = {5, 9, 12, 13, 16, 45};

        Node root = buildHuffmanTree(weights);

        System.out.println("Preorder traversal of Huffman Tree:");
        printTree(root);
    }
}