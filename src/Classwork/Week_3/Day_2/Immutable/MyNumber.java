package Classwork.Week_3.Day_2.Immutable;

public final class MyNumber {

    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

//  public void setValue(int value) {
//    this.value = value;
//  }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public MyNumber add(MyNumber number) {
        return new MyNumber(value + number.value);
    }


}
