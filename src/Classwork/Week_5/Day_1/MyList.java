package Classwork.Week_5.Day_1;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyList extends AbstractList {
    private static final int DEFAULT_SIZE = 16;

    private Object[] elements;
    private int count;

    public MyList() {
//    elements = new Object[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public MyList(int size) {
        elements = new Object[size];
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity();
        elements[count++] = o;
        return true;
    }

    @Override
    public void add(int index, Object element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, this.count - 1);
        elements[index] = element;
        count++;
    }

    @Override
    public Object set(int index, Object element) {
        return elements[index] = element;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(o)) {
//                System.arraycopy(elements, i+1, elements, i , count);
//                count--;
                remove(i + 1);
            }
        }
        return true;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size() - 1) {
            elements[index] = null;
        }
        else {System.arraycopy(elements, index + 1, elements, index, count - index - 1);}
        count--;
        return elements;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (o.equals(elements[i])) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public void clear() {
        for (int i = size(); i > 0; i--) {
            remove(i);
        }
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List tmp = new MyList(toIndex - fromIndex + 1);
        for (int j = fromIndex; j <= toIndex; j++) {
            tmp.add(elements[j]);
        }
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean removeAll(Collection c) {
        return super.removeAll(c);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public Object[] toArray() {
        return super.toArray();
    }

    @Override
    public String toString() {
        return "MyList{" +
                "elements=" + Arrays.toString(elements) +
                ", count=" + count +
                '}';
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return count;
    }

    public void ensureCapacity() {
        if (count >= elements.length) {
            Object[] tmp = new Object[elements.length * 2];
            System.arraycopy(elements, 0, tmp, 0, elements.length);
            elements = tmp;
        }
    }
}
