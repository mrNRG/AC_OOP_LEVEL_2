package Classwork.Week_3.Day_1.Test;

import Classwork.Week_3.Day_1.Classes.MyStack;
import Classwork.Week_3.Day_1.Interfaces.IStack;

public class TestStack {

    public static void main(String[] args) {
        IStack stack = new MyStack();

        Integer i = 5;
        Integer i1 = new Integer(5);


        stack.push(new Integer(1));
        stack.push(new Integer(2));
        stack.push(new Integer(3));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
