import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter the number of rows for the first matrix:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int m = sc.nextInt();
        int[][] matrix1 = new int[n][m];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter the number of rows for the second matrix:");
        int p = sc.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int q = sc.nextInt();
        int[][] matrix2 = new int[p][q];

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Check if matrices can be added
        if (n != p || m != q) {
            System.out.println("Matrices cannot be added because they have different dimensions.");
        } else {
            // Matrix addition
            int[][] result = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Displaying the result matrix
            System.out.println("Result of matrix addition:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
