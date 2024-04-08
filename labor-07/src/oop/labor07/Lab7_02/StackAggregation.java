package oop.labor07.Lab7_02;

import java.util.ArrayList;

public class StackAggregation {
    private final ArrayList<Object> items;
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<Object>(capacity);
    }

    public boolean isFull() {
        return items.size() == capacity;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(Object item) {
        if (!isFull()) {
            items.add(item);
        } else {
            System.out.println("Stack is full!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            items.remove(items.size() - 1);
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public Object top() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        } else {
            return null;
        }
    }

    public int getSize() {
        return items.size();
    }
}
