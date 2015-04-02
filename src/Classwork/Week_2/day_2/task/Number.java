package Classwork.Week_2.day_2.task;

public class Number extends Object {
    private int value;

    public Number(){}
    public Number(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Number sumNumber(Number number) {
        return new Number(this.value+number.getValue());
    }

    public Number minusNumber(Number number) {
        return new Number(this.value-number.getValue());
    }

    public Number divideNumber(Number number) {
        return new Number(this.value/number.getValue());
    }

    public String toString() {
        return String.valueOf(value);
    }

    public boolean equals (Object obj) {
        if (obj == null ) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Number)) {
            return false;
        }
        Number other = (Number)obj;
        return other.getValue() == this.value;
    }
}
