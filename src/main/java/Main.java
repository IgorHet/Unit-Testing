import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayOperations ArrayOperationsObject = new ArrayOperations();
        int[][] Matrix1 = new int[5][5];
        int[][] Matrix2 = new int[][]{{1,2,3}, {1,2,3,4}, {1,2,3}};
        int[][] Matrix3 = new int[0][0];
        int[][] Matrix4 = null;
        int[][] Matrix5 = new int[3][4];
        for (int i = 0; i < Matrix3.length; i++) {
            System.out.println(Arrays.toString(Matrix3[i]));
        }
        System.out.println(ArrayOperationsObject.isSquareMatrix(Matrix1));
        System.out.println(ArrayOperationsObject.isSquareMatrix(Matrix2));
        System.out.println(ArrayOperationsObject.isSquareMatrix(Matrix3));
        System.out.println(ArrayOperationsObject.isSquareMatrix(Matrix4));
        System.out.println(ArrayOperationsObject.isSquareMatrix(Matrix5));
    }
}