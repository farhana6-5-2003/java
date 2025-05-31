public class SymmetricMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);  // Matrix size (n x n)

        if (args.length != (n * n + 1)) {
            System.out.println("Invalid number of arguments.");
            return;
        }

        int[][] matrix = new int[n][n];

        // Fill the matrix from command-line arguments
        int index = 1; // Start after the size argument
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(args[index++]);
            }
        }

        // Check for symmetry
        boolean isSymmetric = true;
        for (int i = 0; i < n && isSymmetric; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        // Output
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
