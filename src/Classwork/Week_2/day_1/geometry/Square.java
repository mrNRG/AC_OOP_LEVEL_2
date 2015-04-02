package Classwork.Week_2.day_1.geometry;

public class Square extends Figure {

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double square() {
        return side * side;
    }
}
