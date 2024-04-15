import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {
    private ArrayOperations arrayOperations;

    @BeforeEach
    void setUp() {
        arrayOperations = new ArrayOperations();
    }

    @AfterEach
    void tearDown() {
        arrayOperations = null;
    }

    @Test
    void calculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double expected = 3.0; // Середнє арифметичне: (1 + 2 + 3 + 4 + 5) / 5 = 3.0
        assertEquals(expected, arrayOperations.calculateAverage(array));
    }

    @Test
    void isSquareMatrix() {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertTrue(arrayOperations.isSquareMatrix(squareMatrix));

        int[][] nonSquareMatrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        assertFalse(arrayOperations.isSquareMatrix(nonSquareMatrix));
    }
}