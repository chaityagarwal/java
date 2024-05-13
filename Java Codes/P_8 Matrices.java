public class MatrixMultiplicationExample {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2},
            {4, 5},
            {7, 8},
            {10, 11}
        };

        int[][] matrix2 = {
            {2, 0, 1, 5},
            {1, 0, 1, 2},
            {3, 1, 2, 3}
        };

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        // Display the matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nResultant Matrix:");
        displayMatrix(resultMatrix);
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}