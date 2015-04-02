package Classwork.Week_5.Day_2;

import Classwork.Week_3.Day_1.Interfaces.IStack;

public class MyLinkedStack implements IStack {
    private Node top;
    private int size;


    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{" +
                "top=" + top +
                ", size=" + size +
                '}';
    }

    @Override
    public Object pop() {
        if (size <=0) {
            throw new MyEmptyStackException("Stack overflow!");
        }
        Object o = top.value;
        top = top.next;
        size --;
        return o;
    }

    @Override
    public boolean push(Object o) {
        Node oldTop = top;
        top = new Node(o, oldTop);
        size++;
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

    private static class Node {
        private Object value;
        private Node next;

        private Node() {
        }

        private Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
