package oop.labor09.Lab9_01;

public class CircularQueue implements IQueue{
    private int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[5];
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return (rear == -1 && front == 0) || (front == (rear + 1) % CAPACITY);
    }

    public boolean isFull() {
        return (rear + 1) % CAPACITY == front;
    }

    public void enQueue(Object item) {
        if (isFull()) {
            return;
        }
        rear = (rear + 1) % CAPACITY;
        items[rear] = item;
    }

    public Object deQueue() {
        if (isEmpty()) {
            return null;
        }
        Object item = items[front];
        front = (front + 1) % CAPACITY;
        return item;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int count = front;
        while (count != rear) {
            System.out.print(items[count] + " ");
            count = (count + 1) % CAPACITY;
        }
        System.out.print(items[rear]);
        System.out.println();
    }


    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CircularQueue)) {
            return false;
        }
        CircularQueue other = (CircularQueue) obj;
        if (this.CAPACITY != other.CAPACITY) {
            return false;
        }
        if (this.isEmpty() && other.isEmpty()) {
            return true;
        }
        int thisCount = this.front;
        int otherCount = other.front;
        int size = 0;
        while (size < this.CAPACITY && this.items[thisCount] != null && other.items[otherCount] != null) {
            if (!this.items[thisCount].equals(other.items[otherCount])) {
                return false;
            }
            thisCount = (thisCount + 1) % this.CAPACITY;
            otherCount = (otherCount + 1) % other.CAPACITY;
            size++;
        }
        return size == this.CAPACITY;
    }

}
