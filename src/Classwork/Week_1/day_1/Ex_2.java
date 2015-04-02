package Classwork.Week_1.day_1;

import helper.VarHelper;

public class Ex_2 {
    public static void main(String[] args) {

        String[] mas = {"Igor","Artem","Vasya","Petya"};
        int groupSize = 100;
        Man[] group = new Man[groupSize];

        for (int i = 0; i < groupSize; i++) {
            Man man = new Man();
            man.setName(mas[VarHelper.random(mas.length)]);
            man.setAge(VarHelper.random(30));
            group[i] = man;
        }

        for (int i = 0; i < groupSize; i++) {
            group[i].sayHello();
        }
    }
}
