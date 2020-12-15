import java.awt.geom.Rectangle2D;

public class Tricorn extends FractalGenerator {
    public static final int MAX_ITERATIONS = 2000;

    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -2;
        range.width = 4;
        range.height = 4;
    }

    public int numIterations(double x, double y) {
        Complex c = new Complex(0, 0);
        int count = 0;

        while (count < MAX_ITERATIONS && c.getSquaredModule() < 4) {
            c.makeSquaredWithConjInPoint(x, y);

            count++;
        }

        if (count == MAX_ITERATIONS) return -1;

        return count;
    }

    @Override
    public String toString() { return "Tricorn"; }
}