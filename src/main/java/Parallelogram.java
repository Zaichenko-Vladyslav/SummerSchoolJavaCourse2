import java.util.logging.Logger;

public class Parallelogram {

    private static final Logger LOGGER = Logger.getLogger(Parallelogram.class.getName());
    private int biggestSide;
    private int smallerSide;
    private double Angle;

    public Parallelogram() {
    } 

    public Parallelogram(int biggestSide, int smallerSide, double Angle) {
        this.biggestSide = biggestSide;
        this.smallerSide = smallerSide;
        this.Angle = Angle;
    }

    public int getBiggestSide() {
        return biggestSide;
    }

    public void setBiggestSide(int biggestSide) {
        this.biggestSide = biggestSide;
    }

    public int getSmallerSide() {
        return smallerSide;
    }

    public void setSmallerSide(int smallerSide) {
        this.smallerSide = smallerSide;
    }

    public double getAngle() {
        return Angle;
    }

    public void setAngle(double Angle) {
        this.Angle = Angle;
    }

    public double getPerimeter() {
        return 2 * this.getBiggestSide() + 2 * this.getSmallerSide();
    }

    public double getLongDiagonal() {
        return Math.sqrt(this.getBiggestSide() * this.getBiggestSide() +
                this.getSmallerSide() * this.getSmallerSide() + 2 *
                this.getBiggestSide() * this.getSmallerSide() *
                Math.cos(this.getAngle()));
    }

    public double getShortDiagonal() {
        return Math.sqrt(this.getBiggestSide() * this.getBiggestSide() +
                this.getSmallerSide() * this.getSmallerSide() - 2 *
                this.getBiggestSide() * this.getSmallerSide() *
                Math.cos(this.getAngle()));
    }

    public boolean isRhombus() {

        boolean result = true;

        if (this.getBiggestSide() == this.getSmallerSide()) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    public boolean isSquare() {

        boolean result = true;

        if (this.getBiggestSide() == this.getSmallerSide() &&
                this.getAngle() == Math.PI * 0.5) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

    @Override
    public String toString() {
        return "Parallelogram {" +
                "Big Side = " + biggestSide +
                ", Small Side = " + smallerSide +
                ", Angle = " + Angle +
                ", \nPerimeter = " + this.getPerimeter() +
                ", Long Diagonal = " + this.getLongDiagonal() +
                ", \nShort Diagonal = " + this.getShortDiagonal() +
                ", \nThis is Square? - " + this.isSquare() +
                ", This is Rhombus? - " + this.isRhombus() +
                '}' + "\n";
    }

}

