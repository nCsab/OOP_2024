package oop.labor09.Lab9_01;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue{
    private ArrayList<Object> items;
    private int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.items = new ArrayList<>();
        this.CAPACITY = CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size() >= CAPACITY;
    }

    @Override
    public void enQueue(Object item) {
        if (items.size() < CAPACITY) {
            items.add(item);
        }
    }

    @Override
    public Object deQueue() {
        if (items.isEmpty()) {
            return null; // queue is empty
        }
        return items.remove(0);
    }

    @Override
    public void printQueue() {
        for (Object item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ArrayListQueue other = (ArrayListQueue) obj;
        if (items.size() != other.items.size()) {
            return false;
        }
        for (int i = 0; i < items.size(); i++) {
            if (!items.get(i).equals(other.items.get(i))) {
                return false;
            }
        }
        return true;
    }
}

