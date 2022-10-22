import java.util.logging.Logger;

public class Parallelogram {

    private static final Logger LOGGER = Logger.getLogger(Parallelogram.class.getName());

    private int bigSide;
    private int smallSide;
    private double angle;

    public Parallelogram() {

    }

    public Parallelogram(int bigSide, int smallSide, double angle) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
        this.angle = angle;
    }

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getPerimeter() {
        return 2 * this.getBigSide() + 2 * this.getSmallSide();
    }

    public double getLongDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() + 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    public double getShortDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() - 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    public boolean isRhombus() {

        boolean result = true;

        if (this.getBigSide() == this.getSmallSide()) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public boolean isSquare() {

        boolean result = true;

        if (this.getBigSide() == this.getSmallSide() && this.getAngle() == Math.PI * 0.5) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    @Override
    public String toString() {
        return "Parallelogram:" +
                "\nBig Side = " + bigSide +
                "\nSmall Side = " + smallSide +
                "\nAngle = " + angle +
                "\nPerimeter = " + this.getPerimeter() +
                "\nLong Diagonal = " + this.getLongDiagonal() +
                "\nShort Diagonal = " + this.getShortDiagonal() +
                "\nThis is Square? - " + this.isSquare() +
                "\nThis is Rhombus? - " + this.isRhombus();
    }
}

