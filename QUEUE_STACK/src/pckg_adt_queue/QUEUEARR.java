package pckg_adt_queue;

import java.util.Arrays;

public class QUEUEARR <E> implements ADTQUEUE <E> {

    private int front;
    private int capacity;
    private static final int CAPACITY = 10;
    private int size;
    private E[] queue;


    public QUEUEARR() {
        this.capacity = CAPACITY;
        this.size = 0;
        this.front = 0;
        this.queue = (E[]) new Object[this.capacity];
    }

    public QUEUEARR(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.queue = (E[]) new Object[this.capacity];
    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E first() {
        E element = null;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            element = this.queue[this.front];
        }
        return element;
    }

    @Override
    public void enqueue(E element) {
        if (this.size < this.capacity) {
            System.out.println("Adding new element to the queue");
            int index = (front + size) % capacity;
            this.queue[index] = element;
            System.out.println("Element added to index position: " + index);
            this.size++;
        } else {
            System.out.println("Queue is full");
        }

    }

    @Override
    public E dequeue() {
        E element = null;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            element = this.queue[this.front];
            this.queue[this.front] = null;
            this.front = (this.front + 1) % this.capacity;
            this.size--;
            System.out.println("Processing element: " + element);
        }
        return element;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        String front = "Front: ";
        String size = "Size: ";
        String representation = "";
        if (isEmpty()) {
            size+= this.size;
        } else {
            front = front + this.front;
            size += this.size;
            for (int i = 0; i < this.capacity; i++) {
                representation += "[ " + this.queue[i] + " ]";
            }
        }
        return size + "\n" + front + "\n" + representation;
    }
}
