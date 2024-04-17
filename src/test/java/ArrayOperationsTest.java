import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    void testEmptyMatrix() {
        int[][] matrix = {};
        assertFalse(ArrayOperations.isSquareMatrix(matrix));
    }

    @Test
    void testSquareMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertTrue(ArrayOperations.isSquareMatrix(matrix));
    }

    @Test
    void testNonSquareMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertFalse(ArrayOperations.isSquareMatrix(matrix));
    }

    @Test
    void testJaggedMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6}
        };
        assertFalse(ArrayOperations.isSquareMatrix(matrix));
    }

    @Test
    void testNullMatrix() {
        int[][] matrix = null;
        assertFalse(ArrayOperations.isSquareMatrix(matrix));
    }
}