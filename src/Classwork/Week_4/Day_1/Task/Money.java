package Classwork.Week_4.Day_1.Task;

public class Money {
    private String currency;
    private int value;

    public Money() {
    }

    public Money(String currency, int value) {
        this.currency = currency;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", value=" + value +
                '}';
    }
}