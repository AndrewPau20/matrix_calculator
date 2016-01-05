package matrix_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void linearsystem() throws MatrixException {
        double[][] contentsA = {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
        };
        SquareMatrix A = new SquareMatrix(3, contentsA);
        
        double[] c1 = {12, 16, 9};
        Vector b1 = new Vector(c1);
        
        Vector x1 = A.solve(b1); // Should have no solution
        assertEquals(x1, null);
        
        double[][] contentsB = {
                        { 1, 0, 1, 0 },
                        { 0, 2, 2, 2 },
                        { 4, -2, 2, -2 }
        };
        Matrix B = new Matrix(3, 4, contentsB);
        
        double c2[] = {2, -10, 18};
        Vector b2 = new Vector(c2);
        
        Vector x2 = B.solve(b2);
        
        double[] r2 = {2.0, -5.0, 0.0, 0.0};
        Vector result2 = new Vector(r2);
        
        assertTrue(x2.equals(result2));
        
        B.generalSolution(b2);
    }

}
