package Classwork.Week_3.Day_1.Classes;

import Classwork.Week_3.Day_1.Interfaces.IStack;

public class MyStack implements IStack {

    private static final int DEFAULT_SIZE = 16;

    private Object[] elements;
    private int index;

    public MyStack() {
//    elements = new Object[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public MyStack(int size) {
        elements = new Object[size];
    }

    @Override
    public Object pop() {
        if(index == 0) {
            return new Object();
        }

        Object top = elements[--index];
        //elements[index] = null;
        return top;
    }

    @Override
    public boolean push(Object o) {
        if(index >= elements.length) {
            return false;
        }
        elements[index] = o;
        index++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }
}
