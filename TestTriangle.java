import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class TestTriangle {

    @Test
    public void testInvalidEdges() {
        try {
            double[] badEdges = new double[]{1, 1, 5};
            Triangle notGood = new Triangle(badEdges);
            fail("The method didn't throw when it should have");
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    public void testAlmostTriangle() {
        try {
            double[] badEdges = new double[]{1, 1, 2};
            Triangle close = new Triangle(badEdges);
            fail("The method didn't throw when it should have");
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    public void testZeroLengthEdge() {
        try {
            double[] badEdges = new double[]{0, 1, 1};
            Triangle zeroSide = new Triangle(badEdges);
            fail("The method didn't throw when it should have");
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    public void testAllZeroEdges() {
        try {
            double[] badEdges = new double[]{0, 0, 0};
            Triangle allZero = new Triangle(badEdges);
            fail("The method didn't throw when it should have");
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    public void testNegativeEdges() {
        try {
            double[] badEdges = new double[]{4, -3, 5};
            Triangle negative = new Triangle(badEdges);
            fail("The method didn't throw when it should have");
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    public void testAllNegativeEdges() {
        try {
            double[] badEdges = new double[]{-3, -3, -3};
            Triangle allNegative = new Triangle(badEdges);
            fail("The method didn't throw when it should have");
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    public void testAllNegativeNonIntEdges() {
        try {
            double[] badEdges = new double[]{-2.3, -3.2, -4.4};
            Triangle allNegativeNonInt = new Triangle(badEdges);
            fail("The method didn't throw when it should have");
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    public void testEquilateralTriangle() {
        double[] edges = new double[]{3, 3, 3};
        Triangle allSame = new Triangle(edges);
        assertEquals(allSame.getTriangleType(), Type.EQUILATERAL);
    }

    @Test
    public void testNonIntegerEquilateralTriangle() {
        double[] edges = new double[]{3.3, 3.3, 3.3};
        Triangle noIntAllSame = new Triangle(edges);
        assertEquals(noIntAllSame.getTriangleType(), Type.EQUILATERAL);
    }

    @Test
    public void testIsoscelesTriangle() {
        double[] edges = new double[]{2, 3, 3};
        Triangle twoSame = new Triangle(edges);
        assertEquals(twoSame.getTriangleType(), Type.ISOSCELES);
    }

    @Test
    public void testNonIntegerIsoscelesTriangle() {
        double[] edges = new double[]{2, 3.3, 3.3};
        Triangle noIntTwoSame = new Triangle(edges);
        assertEquals(noIntTwoSame.getTriangleType(), Type.ISOSCELES);
    }

    @Test
    public void testScaleneTriangle() {
        double[] edges = new double[]{2, 3, 4};
        Triangle noneSame = new Triangle(edges);
        assertEquals(noneSame.getTriangleType(), Type.SCALENE);
    }

    @Test
    public void testNonIntegerScaleneTriangle() {
        double[] edges = new double[]{2.1, 3.5, 4.2};
        Triangle noIntSame = new Triangle(edges);
        assertEquals(noIntSame.getTriangleType(), Type.SCALENE);
    }

    @Test
    public void testSmallScaleneTriangle() {
        double[] edges = new double[]{0.2, 0.3, 0.4};
        Triangle small = new Triangle(edges);
        assertEquals(small.getTriangleType(), Type.SCALENE);
    }

}