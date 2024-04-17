public class ArrayOperations {
    public double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }
    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row == null || row.length != rows) {
                return false;
            }
        }

        return true;
    }
}