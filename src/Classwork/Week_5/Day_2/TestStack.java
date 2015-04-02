package Classwork.Week_5.Day_2;

import Classwork.Week_3.Day_1.Interfaces.IStack;

public class TestStack {
    public static void main(String[] args) {
        IStack myStack = new MyLinkedStack();
        myStack.push(5);
        myStack.push(10);
        myStack.push(1);
        myStack.push(36);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


    }
}
