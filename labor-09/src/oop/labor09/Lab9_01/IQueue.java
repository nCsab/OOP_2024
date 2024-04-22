package oop.labor09.Lab9_01;

import java.util.ArrayList;

public interface IQueue {
    boolean isEmpty();

    boolean isFull();

    void enQueue(Object item);

    Object deQueue();

    void printQueue();
}

