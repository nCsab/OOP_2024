package oop.labor07.Lab7_02;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private final int capacity;

    public StackInheritance(int capacity) {
        super(capacity);
        this.capacity = capacity;
    }

    public boolean isFull() {
        return size() == capacity;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(Object item) {
        if (!isFull()) {
            add(item);
        } else {
            System.out.println("Stack is full!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            remove(size() - 1);
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public Object top() {
        if (!isEmpty()) {
            return get(size() - 1);
        } else {
            return null;
        }
    }

    public int getSize() {
        return size();
    }
}
