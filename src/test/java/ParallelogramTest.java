import org.junit.Assert;

import java.util.logging.Logger;

public class ParallelogramTest {

    private static final Logger LOGGER = Logger.getLogger(Parallelogram.class.getName());

    Parallelogram parallelogram = new Parallelogram(3,4,0.5);

    @org.junit.Test
    public void getPerimeter() {
        LOGGER.info("Perimeter");
        Assert.assertEquals(14, parallelogram.getPerimeter(), 0.01);
    }

    @org.junit.Test
    public void getLongDiagonal() {
        LOGGER.info("Long Diagonal");
        Assert.assertEquals(6.786, parallelogram.getLongDiagonal(), 0.01);
    }

    @org.junit.Test
    public void getShortDiagonal() {
        LOGGER.info("Short Diagonal");
        Assert.assertEquals(1.984, parallelogram.getShortDiagonal(), 0.01);
    }

    @org.junit.Test
    public void isRhombus() {
        LOGGER.info("Rhombus");
        Assert.assertEquals(false, parallelogram.isRhombus());
    }

    @org.junit.Test
    public void isSquare() {
        LOGGER.info("Square");
        Assert.assertEquals(false, parallelogram.isSquare());
    }
}
