import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int r = s.nextInt();
        int c = s.nextInt();

        if (r != c) {
            System.out.println("The matrix is not square, so it cannot be symmetric.");
            s.close();
            return;
        }

        int[][] matrix = new int[r][c];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        s.close();

        boolean isSymmetric = true;
        outerLoop:  // Label to break both loops
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break outerLoop;  // Break both loops
                }
            }
        }

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
