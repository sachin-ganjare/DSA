import java.util.*;

class TwoDarray {
    int[][] a; 
    int row; 
    int col;

    // Constructor
    TwoDarray(int row, int col) {
        this.row = row;
        this.col = col;
        a = new int[row][col];
    }

    // Initialize matrix
    public void initialize() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter a[%d][%d]: ", i, j);
                a[i][j] = in.nextInt();
            }
        }
        in.close();
    }

    // Print in row-major order
    public void printRowMajor() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Print in column-major order
    public void printColMajor() {
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrix addition
    public TwoDarray addition(TwoDarray b) {
        if (this.row != b.row || this.col != b.col) {
            System.out.println("Error! Matrices are not of the same size.");
            return null;
        }
        TwoDarray c = new TwoDarray(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c.a[i][j] = this.a[i][j] + b.a[i][j];
            }
        }
        return c;
    }

    // Matrix multiplication
    public TwoDarray multiplication(TwoDarray b) {
        if (this.col != b.row) {
            System.out.println("Error! Matrices are not of proper size.");
            return null;
        }
        TwoDarray c = new TwoDarray(this.row, b.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < b.col; j++) {
                c.a[i][j] = 0;
                for (int k = 0; k < this.col; k++) {
                    c.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return c;
    }
}

public class _05_NPTEL_Array2DOperations {
    public static void main(String[] args) {
        TwoDarray x = new TwoDarray(2, 2);
        System.out.println("Enter matrix X:");
        x.initialize();

        TwoDarray y = new TwoDarray(2, 2);
        System.out.println("Enter matrix Y:");
        y.initialize();

        System.out.println("Matrix X:");
        x.printRowMajor();
        System.out.println("Matrix Y:");
        y.printRowMajor();

        TwoDarray z = x.addition(y);
        if (z != null) {
            System.out.println("X + Y:");
            z.printRowMajor();
        }

        z = x.multiplication(y);
        if (z != null) {
            System.out.println("X * Y:");
            z.printRowMajor();
        }
    }
}
