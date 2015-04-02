package Classwork.Week_2.day_1.geometry;

public class Triangle extends Figure{

    private int side;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double square() {
        return side * height * 0.5;
    }


}