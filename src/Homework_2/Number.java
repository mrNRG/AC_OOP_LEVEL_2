package Homework_2;

public class Number extends Object {
    private double value;

    public Number() {
    }

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Number addNumber(Number number) {
        return new Number(this.value + number.getValue());
    }

    public Number diffNumber(Number number) {
        return new Number(this.value - number.getValue());
    }

    public Number multNumber(Number number) {
        return new Number(this.value * number.getValue());
    }

    public Number divNumber(Number number) {
        return new Number(this.value / number.getValue());
    }

    public Number powNumber(Number number, Number pow) {
        Number rez = new Number(1);
        if (pow.getValue() == 0) {
            rez.setValue(1);
        }
        if (pow.getValue() > 0) {
            for (int i = 0; i < pow.getValue(); i++) {
                rez.setValue(rez.getValue() * number.getValue());
            }
        }
        if (pow.getValue() < 0) {
            for (int i = 0; i < -1 * pow.getValue(); i++) {
                rez.setValue(rez.getValue() * number.getValue());
            }
            rez.setValue(1 / rez.getValue());
        }
        return rez;
    }

    public Number factorialNumber() {
        Number f = new Number(1);
        if (this.value>0) {
            for (int i = 1; i <= this.value; i++) {
                f.setValue(f.getValue() * i);
            }
        }
        return f;
    }

    public Number reminderNumber(Number number) {
        return new Number((int)this.value%(int)number.getValue());
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
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
