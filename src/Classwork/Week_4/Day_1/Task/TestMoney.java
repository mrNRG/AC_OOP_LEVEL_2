package Classwork.Week_4.Day_1.Task;

import java.util.Arrays;
import java.util.Comparator;

public class TestMoney {
    public static void main(String[] args) {
        final Money[] money = new Money[10];

        money[0] = new Money("uah",100);
        money[1] = new Money("eur",50);
        money[2] = new Money("usd",10);
        money[3] = new Money("uah",100);
        money[4] = new Money("eur",10);
        money[5] = new Money("usd",50);
        money[6] = new Money("uah",10);
        money[7] = new Money("eur",10);
        money[8] = new Money("uah",100);
        money[9] = new Money("eur",50);

        Arrays.sort(money, new Comparator<Money>() {
            @Override
            public int compare(Money o1, Money o2) {

                if(o1.getValue() > o2.getValue()) {
                    return 1;
                }
                if(o1.getValue() < o2.getValue()) {
                    return -1;
                }
                return 0;
            }
        });


        System.out.println(Arrays.toString(money));
    }

}
